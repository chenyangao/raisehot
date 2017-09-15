/**   
 * @Title: WorkTaskDao.java
 * @Package:com.hottop.raisehot.dao2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日上午11:13:41 
 * @version V1.0   
 */
package com.hottop.raisehot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hottop.raisehot.model.WorkTask;

/**
 * @ClassName: WorkTaskDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日上午11:13:41
 */
public interface WorkTaskDao {

	/**   
	 * @Title: insertTask   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workTask
	 */  
	
	public void insertTask(WorkTask workTask) ;

	/**   
	 * @Title: updateTask   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param taskStatus
	 */  
	
	public void updateTask(@Param("id")String id,@Param("taskStatus")String taskStatus) ;

	/**   
	 * @Title: queryTask   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workTask
	 * @return
	 */  
	
	public List<WorkTask> queryTask(WorkTask workTask);

	/**   
	 * @Title: queryTaskById   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 */  
	
	public WorkTask queryTaskById(String id);

}
