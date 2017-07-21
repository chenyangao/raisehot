/**   
 * @Title: UserService.java
 * @Package:com.hottop.raisehot.service2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:01:21 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

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
	 * @Title: insertUser   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	public int insertUser(User user);

	/**   
	 * @Title: userRegister   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 */  
	
	public void userRegister(User user);

	/**   
	 * @Title: sendMessage   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param username
<<<<<<< HEAD
	 * @return
	 */  
	
	public String sendMessage(String username);

	/**   
	 * @Title: login   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 */  
	
	public void login(User user);

	/**   
	 * @Title: logout   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 */  
	
	public void logout(String id);
=======
	 * @param forType
	 * @param userType
	 * @return
	 */  
	
	public String sendMessage(String username, String forType, String userType);
>>>>>>> fd2cc2cd9a5d51f52faf3fce31f69a4d97a461ab

}
