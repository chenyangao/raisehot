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
}
