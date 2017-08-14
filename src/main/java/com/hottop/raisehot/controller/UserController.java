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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;
 
/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日上午9:41:35
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	/**  
	 * @Fields logger : TODO(用一句话描述这个变量表示什么)  
	 */  
	protected final Logger       logger = LoggerFactory.getLogger(this.getClass());
	/**  
	 * @Fields userService : TODO(用一句话描述这个变量表示什么)  
	 */  
	@Autowired
	private UserService userService;

	/**   
	 * @Title: login   
	 * @Description: 登录入口
	 * @param phoneNumber
	 * @param password
	 * @return
	 */  
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "password", required = true) String password) {
		logger.info(MessageFormat.format("手机号:{0},密码:{1} ",phoneNumber,password));
		User user = userService.login(phoneNumber,password);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		return modelAndView;
	}

	/**   
	 * @Title: userRegister   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public ResponseEntity<User> userRegister(@ModelAttribute(value = "user") User user) {
		logger.info(MessageFormat.format("用户信息:{0}",user.toString()));
		user.setWechatId("cygeagle");
		user.setGoldCoins(0);
		User userReg = userService.userRegister(user);
		ResponseEntity<User> responseEntity = new ResponseEntity<User>(userReg, HttpStatus.OK);
 		return responseEntity;
	}

	/**   
	 * @Title: sendMessage   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param phoneNumber
	 * @return
	 */  
	@RequestMapping(value = "/sendmessage.do", method = RequestMethod.POST)
	public String sendMessage(@RequestParam(value = "phoneNumber", required = true) String phoneNumber) {
		logger.info(MessageFormat.format("手机号:{0}",phoneNumber));
		userService.sendMessage(phoneNumber);
		return phoneNumber;
	}

	/**   
	 * @Title: userModify   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param opt
	 * @return
	 */  
	@RequestMapping(value = "/userOpt.do", method = RequestMethod.POST, params = "id")
	public String userModify(@RequestParam(value = "id", required = true) String id,
			@RequestParam(value = "opt", required = true) String opt) {
		logger.info(MessageFormat.format("修改用户状态:{0},操作:{1} ",id,opt));
		logger.info("用户号{}，操作{}", id, opt);
		userService.userOpt(Long.valueOf(id), opt);
		return id;
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
	public @ResponseBody User userPreview(@RequestParam(value = "id", required = true) String id) {
		logger.info(MessageFormat.format("查看详情 ID:{0}",id));
		User user = userService.preview(id);
		/*int features=SerializerFeature.config(JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.WriteEnumUsingToString, false);
		 String jsonString = JSON.toJSONString(user,features,SerializerFeature.WriteEnumUsingToString);
		System.out.println(jsonString);*/
		return user;

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
	public @ResponseBody  List<User> userManager(@ModelAttribute(value = "user") User user){
		List<User> userlist = userService.getAllUser(user);
 		return userlist;
	}

}
