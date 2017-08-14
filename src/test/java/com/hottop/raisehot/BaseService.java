/**   
 * @Title: BaseService.java
 * @Package:UserServiceTest2017年7月24日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月24日下午3:01:14 
 * @version V1.0   
 */
package com.hottop.raisehot;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hottop.raisehot.service.UserService;
import com.hottop.raisehot.service.WorkOrderService;

/**
 * @ClassName: BaseService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月24日下午3:01:14
 *
 * 
 */
public class BaseService {
	@Autowired
	 UserService userService;
	@Autowired
	  WorkOrderService workOrderService;
	/*
	 * static{
	 * PropertyConfigurator.configure("classpath:conf/log4j.properties"); }
	 */
	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml"});
		userService = (UserService) context.getBean("userService");
		workOrderService = (WorkOrderService) context.getBean("workOrderService");
	}
}
