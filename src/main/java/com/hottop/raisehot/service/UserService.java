/**   
 * @Title: UserService.java
 * @Package:com.hottop.raisehot.service2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:01:21 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import java.util.List;

import com.hottop.raisehot.model.User;

/**
 * @ClassName: UserService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午9:01:21
 *
 * 
 */
public interface UserService {
	/**   
	 * @Title: userRegister   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return 
	 */  
	
	public User userRegister(User user);

	/**   
	 * @Title: sendMessage   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param username
	 * @return
	 */  
	
	public String sendMessage(String username);

	/**   
	 * @Title: login   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param phoneNumber TODO
	 * @param pasword TODO
	 * @return 
	 */  
	
	public User login(String phoneNumber, String pasword);

	/**   
	 * @Title: logout   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param opt TODO
	 */  
	
	public void userOpt(String id, String opt);

	/**   
	 * @Title: preview   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @return 
	 */  
	
	public User preview(String id);

	/**   
	 * @Title: getAllUser   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	
	public List<User> getAllUser(User user);
 
}
