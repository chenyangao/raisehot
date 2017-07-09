/**   
 * @Title: JUnitActionBase.java
 * @Package:com.hottop.raisehot2017年7月9日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月9日下午5:28:43 
 * @version V1.0   
 */
package com.hottop.raisehot;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;

/**
 * @ClassName: JUnitActionBase
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月9日下午5:28:43
 *
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath*:root-context.xml, classpath*:conf/spring.xml,classpath*:conf/spring-mybatis.xml,classpath*:conf/spring-mvc.xml"})
public class JUnitActionBase {
	private static HandlerMapping handlerMapping;
    private static HandlerAdapter handlerAdapter;
    
    /** 
     * 读取spring3 MVC配置文件 
     * @throws UnsupportedEncodingException 
     */
    @Before
    public static void setUp() throws UnsupportedEncodingException {
        if (handlerMapping == null) {
    		ApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml" });
            MockServletContext msc = new MockServletContext();
            msc.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, context);
            handlerMapping = (HandlerMapping) context.getBean(DefaultAnnotationHandlerMapping.class);
            handlerAdapter = (HandlerAdapter) context.getBean(context .getBeanNamesForType(AnnotationMethodHandlerAdapter.class)[0]);
        }
    }
    
    /** 
     * 执行request对象请求的action 
     *  
     * @param request 
     * @param response 
     * @return 
     * @throws Exception 
     */
    @Test
    public ModelAndView excuteAction(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HandlerExecutionChain chain = handlerMapping.getHandler(request);
        ModelAndView model = null;/* handlerAdapter.handle(request, response, chain.getHandler());*/
     // 这里需要声明request的实际类型，否则会报错
     		request.setAttribute(HandlerMapping.INTROSPECT_TYPE_LEVEL_MAPPING, true);
     		try {
     			model = handlerAdapter.handle(request, response, chain.getHandler());
     		} catch (Exception e) {
     			e.printStackTrace();
     		}
     		return model;
     		 
    }

}
