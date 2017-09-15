/**   
 * @Title: WorkOrderService.java
 * @Package:com.hottop.raisehot.service2017年8月4日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月4日下午4:57:02 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import java.util.List;

import com.hottop.raisehot.model.WorkOrder;

/**
 * @ClassName: WorkOrderService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月4日下午4:57:02
 *
 * 
 */
public interface WorkOrderService {

	/**   
	 * @Title: workOrderRelease   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workOrder
	 * @return
	 */  
	
	WorkOrder workOrderRelease(WorkOrder workOrder);

	/**   
	 * @Title: workOrderChange   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param cancel
	 */  
	
	void workOrderChange(String id, WorkOrder.Status cancel);

	/**   
	 * @Title: getAllWorkOrder   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workOrder
	 * @return
	 */  
	
	List<WorkOrder> getAllWorkOrder(WorkOrder workOrder);

}
