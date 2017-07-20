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
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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
//@Repository("userController")
//@Scope("userController")
//@Qualifier("userController")
//@RestController
//@Component("userController")
//@SessionAttributes
//@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "index";
	}
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
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
	@RequestMapping(value = "/logintest.do", method = RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response){
		String account = request.getParameter("userName");
		String password = request.getParameter("password");
		if (account.equals("admin")&&password.equals("1")){
			return "index";
		}else{
			return "login";
		}
	}
	
	@RequestMapping(value="/userregister.do",method=RequestMethod.POST)
	public ModelAndView userRegister(@ModelAttribute(value="user") User user){
		userService.userRegister(user) ;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("");
		modelAndView.addObject("",user);
		return modelAndView;
	}
	
	@RequestMapping(value="/userlogout.do",method=RequestMethod.GET,params="id")
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
	
	/**
     * 发送短信
     * @param username 用户名
     * @param type register/backpwd
     * @return
     * status: 0 2010 2029 1011 1010 1006 1020 
     */
    @RequestMapping(value="/sendmessage.do",method=RequestMethod.POST,produces="application/json")
    public String sendMessage(@RequestParam(value="username",required=true)String username,
            @RequestParam(value="forType",required=true)String forType,
            @RequestParam(value="userType",required=true)String userType){
        if(null == username || "".equals(username)){
            return retContent(2010, null);
        }
        if(!"user".equals(userType) && !"merchant".equals(userType)){
            return retContent(2029, null);
        }
        if(!"register".equals(forType) && !"backpwd".equals(forType)){
            return retContent(2029, null);
        }
        return userService.sendMessage(username, forType, userType);
    }
	
  //参数类型不匹配
  //getPropertyName()获取数据类型不匹配参数名称
  //getRequiredType()实际要求客户端传递的数据类型
  @ExceptionHandler({TypeMismatchException.class})
  @ResponseBody
  public String requestTypeMismatch(TypeMismatchException ex){
      ex.printStackTrace();
      return retContent(-400, "参数类型不匹配,参数" + ex.getPropertyName() + "类型应该为" + ex.getRequiredType());

  }
  //缺少参数异常
  //getParameterName() 缺少的参数名称
  @ExceptionHandler({MissingServletRequestParameterException.class})
  @ResponseBody
  public String requestMissingServletRequest(MissingServletRequestParameterException ex){
      ex.printStackTrace();
      return retContent(-400, "缺少必要参数,参数名称为" + ex.getParameterName());

  }
}
