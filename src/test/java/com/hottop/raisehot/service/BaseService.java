/**   
 * @Title: BaseService.java
 * @Package:UserServiceTest2017年7月24日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月24日下午3:01:14 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserService userService;
	@Autowired
	WorkOrderService workOrderService;
	@Autowired
	WorkTaskServie workTaskServie;
	@Autowired
	OptRecordService optRecordService;

	/*
	 * static{
	 * PropertyConfigurator.configure("classpath:conf/log4j.properties"); }
	 */
	@Before
	public void before() {
		logger.debug("before() - start");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml" });
		userService = (UserService) context.getBean("userService");
		workOrderService = (WorkOrderService) context.getBean("workOrderService");
		workTaskServie = (WorkTaskServie) context.getBean("workTaskServie");
		optRecordService = (OptRecordService) context.getBean("optRecordService");
		logger.info("before() - end");
	}
}
