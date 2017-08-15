/**   
 * @Title: WorkOrderServiceImpl.java
 * @Package:com.hottop.raisehot.service.impl2017年8月4日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月4日下午4:59:57 
 * @version V1.0   
 */
package com.hottop.raisehot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hottop.raisehot.dao.WorkOrderDAO;
import com.hottop.raisehot.model.WorkOrder;
import com.hottop.raisehot.model.enumvalue.WorkOrderStatus;
import com.hottop.raisehot.service.WorkOrderService;

/**
 * @ClassName: WorkOrderServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月4日下午4:59:57
 *
 * 
 */
@Transactional
@Service("workOrderService")
public class WorkOrderServiceImpl implements WorkOrderService {

	@Autowired
	private WorkOrderDAO  workOrderDao ;
	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkOrderService#workOrderRelease(com.hottop.raisehot.model.WorkOrder)
	 */
	@Override
	public WorkOrder workOrderRelease(WorkOrder workOrder) {
		workOrderDao.insertWorkOrder(workOrder);
		return workOrderDao.getWorkOrderById(workOrder.getId());
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkOrderService#workOrderChange(long, com.hottop.raisehot.model.enumvalue.OptType)
	 */
	@Override
	public void workOrderChange(String id, WorkOrderStatus workOrderStatus) {
		workOrderDao.workOrderModifyStatus(id, workOrderStatus.getCode()); 
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkOrderService#getAllWorkOrder(com.hottop.raisehot.model.WorkOrder)
	 */
	@Override
	public List<WorkOrder> getAllWorkOrder(WorkOrder workOrder) {
		return workOrderDao.getAllWorkOrder(workOrder);
	}

}
