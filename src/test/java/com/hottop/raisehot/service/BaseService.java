/**   
 * @Title: BaseService.java
 * @Package:UserServiceTest2017年7月24日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月24日下午3:01:14 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		@SuppressWarnings("resource")
	public static ApplicationContext  context ;
	/*
	 * static{
	 * PropertyConfigurator.configure("classpath:conf/log4j.properties"); }
	 */
	@BeforeClass
	public static  void beforeClass() {
 		   context   = new ClassPathXmlApplicationContext( new String[] { "classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml" });
 	}
}
