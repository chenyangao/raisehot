/**   
 * @Title: UserController.java
 * @Package:com.hottop.raisehot.controller2017年7月2日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日上午9:41:35 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
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
//@Repository("userController")
//@Scope("userController")
//@Qualifier("userController")
//@RestController
//@Component("userController")
//@SessionAttributes
@RequestMapping("/user")
public class UserController{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String index(@CookieValue("serssionId") String sessionId,
			@RequestHeader("Accept-Language") String accpetLanage, @RequestHeader("Host") String ip) {
		logger.info("测试", "index");
		return "home";
	}

 	/**
	 * 登录入口
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/loginTest", method = RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response){
		String account = request.getParameter("userName");
		String password = request.getParameter("password");
		if (account.equals("admin")&&password.equals("1")){
			return "index";
		}else{
			return "login";
		}
	}
	
	@RequestMapping(value="/userRegister",method=RequestMethod.POST)
	public ModelAndView userRegister(@RequestParam(value="user",required=true) User user){
		userService.userRegister(user) ;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("");
		modelAndView.addObject("",user);
		return modelAndView;
	}
	
	@RequestMapping(value="/userLogout",method=RequestMethod.GET,params="id")
	public String userLogout(@RequestParam("id") String id){
		return id;
	}
	
	public String getUser(@RequestBody String requestBody){
		return requestBody;
	}
	@RequestMapping("/{checkCode}")
	public String getCheckCode(@PathVariable("checkCode") String checkCode){
		return checkCode;
		
	}
	
}
