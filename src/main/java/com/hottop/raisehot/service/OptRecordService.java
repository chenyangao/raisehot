/**   
 * @Title: OptRecordService.java
 * @Package:com.hottop.raisehot.service2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日下午2:35:01 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import java.util.List;

import com.hottop.raisehot.model.OptRecord;
import com.hottop.raisehot.model.WorkOrder;
import com.hottop.raisehot.model.WorkTask;

/**
 * @ClassName: OptRecordService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日下午2:35:01
 *
 * 
 */
public interface OptRecordService {
	/**   
	 * @Title: addOptRecord   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param optRecord
	 */  
	public void addOptRecord(OptRecord optRecord);
	/**   
	 * @Title: viewOptRecord   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workOrder
	 * @return
	 */  
	public List<OptRecord> viewOptRecord(WorkOrder workOrder);
	/**   
	 * @Title: viewOptRecord   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workTask
	 * @return
	 */  
	public List<OptRecord> viewOptRecord(WorkTask workTask);
}
