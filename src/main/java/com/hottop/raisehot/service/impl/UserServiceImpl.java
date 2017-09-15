/**   
 * @Title: UserServiceImpl.java
 * @Package:com.hottop.raisehot.service.impl2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:05:25 
 * @version V1.0   
 */
package com.hottop.raisehot.service.impl;


import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hottop.raisehot.dao.UserDAO;
import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;
import com.hottop.raisehot.util.SnowflakeIdWorker;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午9:05:25
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	
	protected final Logger       logger = LoggerFactory.getLogger(this.getClass());

	 /**  
	 * @Fields userDao : TODO(用一句话描述这个变量表示什么)  
	 */  
	@Autowired   //此处自动注入userDao
	private UserDAO userDao;

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#userRegister(com.hottop.raisehot.model.User)
	 */
	@Override
	public User userRegister(User user) {
		//FIXME
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
		String id = String.valueOf(idWorker.nextId());
		user.setId(id);
		user.setCreator(new User(id));
		user.setModifier(new User(id));
		user.setUserStatus(User.Status.Disable);
		userDao.insertUser(user);
		logger.info(MessageFormat.format("用户信息:{0} ",user.toString()));
		logger.info(MessageFormat.format("ID:{0} ",id));
		User userRs = userDao.getUserById(id);
	    logger.info(MessageFormat.format("注册完成的用户信息:{0} ",userRs.toString()));
		return userRs;
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#sendMessage(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String sendMessage(String phoneNumber) {
		//userDao.recordMessage(phoneNumber);
		return null;
	}
	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#logout(java.lang.String)
	 */
	@Override
	public void userOpt(String id, String opt) {
		logger.info("userOpt(Long, String) - start");
	   int i = userDao.userModifyStatus(id, opt);
	   logger.info("userOpt(Long, String) - end" + i);
	   
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String phoneNumber, String pasword) {
		
		Map<String, String> map = new HashMap<String, String>();  
		 map.put("phoneNumber", phoneNumber);  
		 map.put("password", pasword);  
		User userReg = userDao.getUserLogin(map);
		return userReg;
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#preview(java.lang.String)
	 */
	@Override
	public User preview(String id) {
		User user = userDao.getUserById(id);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#getAllUser(com.hottop.raisehot.model.User)
	 */
	@Override
	public List<User> getAllUser(User user) {
		List<User> userList = userDao.getAllUser(user);
		return userList;
	}

}
