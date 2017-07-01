/**   
 * @Title: UserDAO.java
 * @Package:com.hottop.raisehot.dao2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:00:03 
 * @version V1.0   
 */
package com.hottop.raisehot.dao;

import org.springframework.stereotype.Repository;

import com.hottop.raisehot.model.User;

/**
 * @ClassName: UserDAO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午9:00:03
 *
 * 
 */
@Repository("userDao")
public interface UserDAO {
	/**   
	 * @Title: insertUser   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	public int insertUser(User user);
}
