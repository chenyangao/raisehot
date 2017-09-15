/**   
 * @Title: WorkOrderDAO.java
 * @Package:com.hottop.raisehot.dao2017年8月5日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月5日上午10:16:07 
 * @version V1.0   
 */
package com.hottop.raisehot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hottop.raisehot.model.WorkOrder;

/**
 * @ClassName: WorkOrderDAO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月5日上午10:16:07
 *
 * 
 */
public interface WorkOrderDAO {
	/**   
	 * @Title: insertWorkOrder   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param user
	 * @return
	 */  
	public Long insertWorkOrder(WorkOrder user);
 
	/**   
	 * @Title: workOrderModifyStatus   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @param opt
	 * @return
	 */  
	public int workOrderModifyStatus(@Param("id")String id,@Param("opt")String opt);

	/**   
	 * @Title: getWorkOrderById   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param id
	 * @return
	 */  
	public WorkOrder getWorkOrderById(String id);
 
	/**   
	 * @Title: getAllWorkOrder   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param workOrder
	 * @return
	 */  
	public List<WorkOrder> getAllWorkOrder(WorkOrder workOrder);
}
