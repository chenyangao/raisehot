/**   
 * @Title: UserTest.java
 * @Package:com.hottop.raisehot2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:11:55 
 * @version V1.0   
 */
package com.hottop.raisehot;

import java.text.MessageFormat;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.util.SnowflakeIdWorker;
import com.sun.jdi.Method;
import com.sun.tools.javac.util.List;

/**
 * @ClassName: UserTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午9:11:55
 *
 * 
 */
public class UserServiceTest extends BaseService{
	protected final Logger       logger = LoggerFactory.getLogger(this.getClass());
	@Test
	public void addUser() {
		User user = new User();
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
		user.setId(idWorker.nextId());
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
		user.setStatus("01");
		
		User creator = new User();
		creator.setId(System.currentTimeMillis());
		User modifier = new User();
		modifier.setId(System.currentTimeMillis());
		user.setCreator(creator);
		user.setModifier(modifier);
		
		user.setCreateTime(new java.util.Date());
		user.setUpdateTime(new java.util.Date());
		
		user.setStartDate(new java.util.Date());
		user.setEndDate(new java.util.Date());
		
		logger.info(MessageFormat.format("用户信息:{0} ",user.toString()));

	}
	@Test
	public void sendMessage(){
		userService.sendMessage("18516029987");
	}
	@Test
	public void login(){
		User user = userService.login("18516029987", "eagle8711");
		logger.info(MessageFormat.format("用户信息:{0} ",user.toString()));
	}
	@Test
	public void preview(){
		User user = userService.preview(1500830830919L);
		logger.info(MessageFormat.format("用户信息:{0} ",user.toString()));
	}
	@Test
	public void getAllUser(){
		User user = null ;
		List<User> userList = userService.getAllUser(user );
		logger.info(MessageFormat.format("用户信息:{0} ",user.toString()));
	}
}
