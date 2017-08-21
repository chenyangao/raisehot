/**   
 * @Title: MockitoTest.java
 * @Package:com.hottop.raisehot.mockmvc2017年8月18日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月18日下午3:20:38 
 * @version V1.0   
 */
package com.hottop.raisehot.mock;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;
import com.hottop.raisehot.service.impl.UserServiceImpl;

/**
 * @ClassName: MockitoTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月18日下午3:20:38
 *
 * 
 */
public class MockitoTest {
	UserService userService = mock(UserService.class);
	UserServiceImpl userServiceImpl = mock(UserServiceImpl.class);
	@Mock
	User user ;
	@Before
	public  void Before(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void test() {
		List<User> users = userService.getAllUser(new User());
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user.toString());
		}
 	}

}
