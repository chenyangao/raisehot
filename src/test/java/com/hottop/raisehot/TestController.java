/**   
 * @Title: TestController.java
 * @Package:com.hottop.raisehot2017年7月2日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日下午4:01:19 
 * @version V1.0   
 */
package com.hottop.raisehot;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hottop.raisehot.controller.UserController;

/**
 * @ClassName: TestController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日下午4:01:19
 *
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath*:root-context.xml, classpath*:conf/spring.xml,classpath*:conf/spring-mybatis.xml,classpath*:conf/spring-mvc.xml"})
//@WebMvcTest(controllers = UserController.class)
public class TestController {

	// 模拟request,response  
    private MockHttpServletRequest request;  
    private MockHttpServletResponse response;   
      
    // 注入loginController  
    //private LoginController loginController ;  
    
    @Autowired
    private UserController userController ;


      
    // 执行测试方法之前初始化模拟request,response  
    @Before    
    public void setUp(){    
        request = new MockHttpServletRequest();      
        request.setCharacterEncoding("UTF-8");      
        response = new MockHttpServletResponse(); 
        userController  = (UserController) AppUtil.getBean("userController");
    }         
    /** 
     *  
     * @Title：testLogin 
     * @Description: 测试用户登录   
     */  
    @Test  
    public void testLogin() {   
        userController  = (UserController) AppUtil.getBean("userController");
        try {  
        	request.setParameter("userName", "admin");
        	request.setParameter("password", "2");
            assertEquals("index",userController.login(request,response)) ;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    } 

}
