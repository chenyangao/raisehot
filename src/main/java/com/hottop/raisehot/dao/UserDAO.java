/**   
 * @Title: UserDAO.java
 * @Package:com.hottop.raisehot.dao2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午9:00:03 
 * @version V1.0   
 */
package com.hottop.raisehot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
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
	 * @return TODO
	 */  
	public Long insertUser(User user);

	/**   
	 * @Title: getUser   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param phoneNumber
	 * @param pasword
	 * @return
	 */  
	
	public User getUser(String phoneNumber, String pasword);

	/**   
	 * @Title: recordMessage   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param phoneNumber
	 */  
	
	public void recordMessage(String phoneNumber);

	/**   
	 * @Title: userModifyStatus   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param opt TODO
	 * @return
	 */  
	
	public int userModifyStatus(@Param("id")Long id,@Param("opt")String opt);

	/**   
	 * @Title: getUserLogin   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param map TODO
	 * @return
	 */  
	
	public User getUserLogin(Map map);

	/**   
	 * @Title: getUserById   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @return
	 */  
	
	public User getUserById(Long id);

	/**   
	 * @Title: getAllUser   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	
	public List<User> getAllUser(User user);
}
