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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;
import com.sun.jdi.Method;
import com.sun.tools.javac.util.List;

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
	public ModelAndView userRegister(@ModelAttribute(value = "user") User user) {
		logger.info(MessageFormat.format("用户信息:{0}",user.toString()));
		user.setWechatId("cygeagle");
		user.setGoldCoins(0);
		user.setStatus("0");
		User userReg = userService.userRegister(user);
		ModelAndView modelAndView = new ModelAndView();
 		modelAndView.addObject("", userReg);
		return modelAndView;
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
		userService.userOpt(id, opt);
		return id;
	}

	/**   
	 * @Title: userPreview   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @return
	 */  
	@RequestMapping(value = "/preview.do", method = RequestMethod.POST)
	public ModelAndView userPreview(@RequestParam("id") String id) {
		logger.info(MessageFormat.format("查看详情 ID:{0}",id));
		User user = userService.preview(Long.valueOf(id));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("", user);
		return modelAndView;
	}
	
	@RequestMapping(value = "/useruanager.do", method = RequestMethod.POST)
	public ModelAndView userManager(@ModelAttribute(value = "user") User user){
		List<User> userlist = userService.getAllUser(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("", userlist);
		return modelAndView;
	}

}
