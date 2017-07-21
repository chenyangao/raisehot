/**   
 * @Title: UserServiceImpl.java
 * @Package:com.hottop.raisehot.service.impl2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:05:25 
 * @version V1.0   
 */
package com.hottop.raisehot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hottop.raisehot.dao.UserDAO;
import com.hottop.raisehot.model.User;
import com.hottop.raisehot.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午9:05:25
 *
 * 
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	 @Autowired   //此处自动注入userService
	private UserDAO userDao;

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#insertUser(com.hottop.raisehot.service.User)
	 */
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#userRegister(com.hottop.raisehot.model.User)
	 */
	@Override
	public void userRegister(User user) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#sendMessage(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
<<<<<<< HEAD
	public String sendMessage(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#login(com.hottop.raisehot.model.User)
	 */
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.UserService#logout(java.lang.String)
	 */
	@Override
	public void logout(String id) {
		// TODO Auto-generated method stub
		
	}
=======
	public String sendMessage(String username, String forType, String userType) {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> fd2cc2cd9a5d51f52faf3fce31f69a4d97a461ab
}
