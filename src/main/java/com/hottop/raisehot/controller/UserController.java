/**   
 * @Title: UserController.java
 * @Package:com.hottop.raisehot.controller2017年7月2日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日上午9:41:35 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日上午9:41:35
 *
 * 
 */
@Controller
@Repository("userController")
//@Scope("userController")
//@Qualifier("userController")
//@RestController
@Component("userController")
@SessionAttributes
public class UserController{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
 	@RequestMapping(value = "/htm", method = RequestMethod.GET)
	public String index() {
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
}
