/**   
 * @Title: UserTest.java
 * @Package:com.hottop.raisehot2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:11:55 
 * @version V1.0   
 */
package com.hottop.raisehot;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;

/**
 * @ClassName: UserTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午9:11:55
 *
 * 
 */
public class UserTest {
private UserService userService;
	
	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml" });
		userService = (UserService) context.getBean("userService");
	}

	@Test
	public void addUser() {
		User user = new User();
		System.out.println(userService.insertUser(user));
	}
}
