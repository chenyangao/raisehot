/**   
 * @Title: WorkTaskServies.java
 * @Package:com.hottop.raisehot.service2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日上午11:05:53 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import java.util.List;

import com.hottop.raisehot.model.WorkTask;
import com.hottop.raisehot.model.enums.TaskStatus;

/**
 * @ClassName: WorkTaskServies
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日上午11:05:53
 *
 * 
 */
public interface WorkTaskServie {
	
	/**   
	 * @Title: receiveTask   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workTask
	 * @return
	 */  
	public WorkTask receiveTask(WorkTask workTask);
	/**   
	 * @Title: cancelTask   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param taskStatus
	 */  
	public void cancelTask(String id,TaskStatus taskStatus);
	/**   
	 * @Title: completeTask   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param taskStatus
	 */  
	public void completeTask(String id,TaskStatus taskStatus);
	
	/**   
	 * @Title: viewTaskList   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workTask
	 * @return
	 */  
	public List<WorkTask> viewTaskList(WorkTask workTask);

	/**   
	 * @Title: previewTask   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @return
	 */  
	public WorkTask previewTask(String id);
}
