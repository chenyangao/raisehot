/**   
 * @Title: UserController.java
 * @Package:com.hottop.raisehot.controller2017年7月2日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日上午9:41:35 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import java.text.MessageFormat;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;
 
/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日上午9:41:35
 * 
 */
@RestController
@RequestMapping("/user")
@EnableAutoConfiguration //用于自动配置。简单的说，它会根据你的pom配置（实际上应该是根据具体的依赖）来判断这是一个什么应用，并创建相应的环境。
public class UserController extends BaseController {
	/**  
	 * @Fields logger : TODO(用一句话描述这个变量表示什么)  
	 */  
	protected final Logger       logger = LoggerFactory.getLogger(this.getClass());
	/**  
	 * @Fields userService : TODO(用一句话描述这个变量表示什么)  
	 */  
	@Resource
	private UserService userService;

	/**   
	 * @Title: login   
	 * @Description: 登录入口
	 * @param phoneNumber
	 * @param password
	 * @return
	 */  
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public RestResult<User> login(@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "password", required = true) String password) {
		logger.info(MessageFormat.format("手机号:{0},密码:{1} ",phoneNumber,password));
		User user = userService.login(phoneNumber,password);
		ObjectMapper mapper = new ObjectMapper();  
		        //User类转JSON  
		       //输出结果：{"name":"小民","age":20,"birthday":844099200000,"email":"xiaomin@sina.com"}  
		         String json;
				try {
					json = mapper.writeValueAsString(user);
					System.out.println(json);  
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		return retSuccessResult(user);
	}

	/**   
	 * @Title: userRegister   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public RestResult<User> userRegister(@ModelAttribute(value = "user") User user) {
		logger.info(MessageFormat.format("用户信息:{0}",user.toString()));
		user.setWechatId("cygeagle");
		user.setGoldCoins(0);
		User userReg = userService.userRegister(user);
		return retSuccessResult(userReg);

	}

	/**   
	 * @Title: sendMessage   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param phoneNumber
	 * @return
	 */  
	@RequestMapping(value = "/sendmessage.do", method = RequestMethod.POST)
	public RestResult<String> sendMessage(@RequestParam(value = "phoneNumber", required = true) String phoneNumber) {
		logger.info(MessageFormat.format("手机号:{0}",phoneNumber));
		userService.sendMessage(phoneNumber);
		return RestResultGenerator.genSuccessResult(phoneNumber);
	}

	/**   
	 * @Title: userModify   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param opt
	 * @return
	 */  
	@RequestMapping(value = "/userOpt.do", method = RequestMethod.POST, params = "id")
	public RestResult<?> userModify(@RequestParam(value = "id", required = true) String id, @RequestParam(value = "opt", required = true) String opt) {
		logger.info(MessageFormat.format("修改用户状态:{0},操作:{1} ",id,opt));
		logger.info("用户号{}，操作{}", id, opt);
		userService.userOpt(id, opt);
		return RestResultGenerator.genSuccessResult();

	}

	/**   
	 * @Title: userPreview   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @return
	 */ 
    /**
     * 当使用@RequestMapping URI template 样式映射时， 即 someUrl/{paramId},
     * 这时的paramId可通过 @Pathvariable注解绑定它传过来的值到方法的参数上。
     */
	
	@RequestMapping(value = "/preview.do", method = RequestMethod.POST)
	public RestResult<User> userPreview(@RequestParam(value = "id", required = true) String id) {
		logger.debug(MessageFormat.format("查看详情 ID:{0}",id));
		User user = userService.preview(id);
		/*int features=SerializerFeature.config(JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.WriteEnumUsingToString, false);
		 String jsonString = JSON.toJSONString(user,features,SerializerFeature.WriteEnumUsingToString);
		System.out.println(jsonString);*/
		return RestResultGenerator.genSuccessResult(user);
	}
	
	/**   
	 * @Title: userManager   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	  /**
     * @ResponseBody注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，
     * 写入到Response对象的body数据区 使用的时候Controller返回的不是界面的时候，是json或者xml
     */
	@RequestMapping(value = "/useruanager.do", method = RequestMethod.POST)
	public RestResult<List<User>> userManager(@ModelAttribute(value = "user") User user){
		List<User> userlist = userService.getAllUser(user);
        return RestResultGenerator.genSuccessResult(userlist);
	}

}
