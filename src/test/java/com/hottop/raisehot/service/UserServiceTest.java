/**   
 * @Title: UserTest.java
 * @Package:com.hottop.raisehot2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:11:55 
 * @version V1.0   
 */
package com.hottop.raisehot.service;


import java.text.MessageFormat;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.util.SnowflakeIdWorker;

/**
 * @ClassName: UserTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午9:11:55
 *
 * 
 */
//@RunWith(Parameterized.class)
public class UserServiceTest extends BaseService{
	protected final Logger       logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserService userService;
	@Before
	public void before(){
		userService = (UserService) context.getBean("userService");
	}
	@Test
	public void addUser() {
		logger.debug("addUser() - start");

		User user = new User();
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
		String id = String.valueOf(idWorker.nextId());
		user.setId(id);
		user.setPhoneNumber("18516029987");
		user.setUserType("1");
		user.setNickName("火星人漂流");
		user.setPassword("eagle8711");
		user.setWechatId("cygeagle");
		user.setIsNumber("160212499");
		user.setIsName("火星人漂流");
		user.setQq("160212499");
		user.setProvince("湖南");
		user.setGoldCoins(0);
		
		User creator = new User();
		creator.setId(id);
		User modifier = new User();
		modifier.setId(id);
		user.setCreator(creator);
		user.setModifier(modifier);
		
		user.setCreateTime(new java.util.Date());
		user.setUpdateTime(new java.util.Date());
		
		user.setStartDate(new java.util.Date());
		user.setEndDate(new java.util.Date());
		User userRs = userService.userRegister(user);
		logger.info(MessageFormat.format("用户信息:{0} ",userRs.toString()));

		logger.debug("addUser() - end");
	}
	@Test
	public void userOpt() {
		logger.info("userOpt() - start");
		userService.userOpt("339444585916792832", "2");
		logger.info("userOpt() - end");
	}
	@Test
	public void sendMessage(){
		logger.debug("sendMessage() - start");
		userService.sendMessage("18516029987");
		logger.debug("sendMessage() - end");
	}
	@Test
	public void login(){
		logger.debug("login() - start");
		User user = userService.login("18516029987", "eagle8711");
		if(user!=null){
			logger.info(MessageFormat.format("用户信息:{0} ",user.toString())); 
		}
		}
	@Test
	public void preview(){
		logger.debug("getAllUser() - start");
		User user = userService.preview("1500830830919");
		if(user!=null){
			logger.info(MessageFormat.format("用户信息:{0} ",user.toString()));
		}
	}
	@Test
	public void getAllUser(){
		User user = new User() ;
		List<User> userList = userService.getAllUser(user );
		for (int i = 0; i < userList.size(); i++) {
			logger.info(MessageFormat.format("用户信息:{0} ",userList.get(i).toString()));
		}
	}
}
