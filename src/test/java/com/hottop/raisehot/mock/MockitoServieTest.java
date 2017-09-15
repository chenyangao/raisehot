/**   
 * @Title: MockitoTest.java
 * @Package:com.hottop.raisehot.mockmvc2017年8月18日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月18日下午3:20:38 
 * @version V1.0   
 */
package com.hottop.raisehot.mock;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;

/**
 * @ClassName: MockitoTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月18日下午3:20:38
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MockitoServieTest {
	  @Autowired
	private  UserService userService  ; 
		protected final Logger       logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testdd() {
		List<User> users = userService.getAllUser(new User());
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			logger.info(user.toString());
		}
 	}
}
