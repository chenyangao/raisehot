/**   
 * @Title: WorkTask.java
 * @Package:com.hottop.raisehot.model2017年7月8日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月8日上午12:58:15 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import java.util.List;

import com.hottop.raisehot.model.enumvalue.TaskStatus;

/**
 * @ClassName: 工作任务
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午12:58:15
 *
 * 
 */
public class WorkTask extends BaseModel {
	
	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 7747898440138633287L;
	/**  
	 * @Fields workOrder : 工作单  
	 */  
	private WorkOrder workOrder ;
	/**  
	 * @Fields taskStatus : 任务状态  
	 */  
	private TaskStatus taskStatus ;
	/**  
	 * @Fields orderUser : TODO(用一句话描述这个变量表示什么)  
	 */  
	private User orderUser ;
	
	/**  
	 * @Fields optRecords : 操作记录 
	 */  
	private List<OptRecord> optRecords ;
	 
	/**
	 * @return the workOrder
	 */
	public WorkOrder getWorkOrder() {
		return workOrder;
	}

	/**
	 * @param workOrder the workOrder to set
	 */
	public void setWorkOrder(WorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	/**
	 * @return the taskStatus
	 */
	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	/**
	 * @return the orderUser
	 */
	public User getOrderUser() {
		return orderUser;
	}

	/**
	 * @param orderUser the orderUser to set
	 */
	public void setOrderUser(User orderUser) {
		this.orderUser = orderUser;
	}

	/**
	 * @return the optRecords
	 */
	public List<OptRecord> getOptRecords() {
		return optRecords;
	}

	/**
	 * @param optRecords the optRecords to set
	 */
	public void setOptRecords(List<OptRecord> optRecords) {
		this.optRecords = optRecords;
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.model.BaseModel#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.model.BaseModel#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.model.BaseModel#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
