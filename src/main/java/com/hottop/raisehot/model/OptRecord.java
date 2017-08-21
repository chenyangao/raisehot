/**   
 * @Title: OptRecord.java
 * @Package:com.hottop.raisehot.model2017年7月25日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月25日下午5:58:29 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import com.hottop.raisehot.model.enumvalue.OptType;

/**
 * @ClassName: OptRecord
 * @Description: 任务操作记录表
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月25日下午5:58:29
 *
 * 
 */
public class OptRecord extends BaseModel {
	
	/**  
	 * @Title: OptRecord  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param id
	 */
	public OptRecord(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	/**  
	 * @Title: OptRecord  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 */
	public OptRecord() {
		// TODO Auto-generated constructor stub
	}
	/**  
	 * @Fields workOrder : TODO(用一句话描述这个变量表示什么)  
	 */  
	WorkOrder workOrder ;
	/**  
	 * @Fields workTask : TODO(用一句话描述这个变量表示什么)  
	 */  
	WorkTask workTask ;
	/**  
	 * @Fields optType : TODO(用一句话描述这个变量表示什么)  
	 */  
	OptType optType = OptType.Disable;

	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 2378736221789658873L;

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

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

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
	 * @return the workTask
	 */
	public WorkTask getWorkTask() {
		return workTask;
	}

	/**
	 * @param workTask the workTask to set
	 */
	public void setWorkTask(WorkTask workTask) {
		this.workTask = workTask;
	}

	/**
	 * @return the optType
	 */
	public OptType getOptType() {
		return optType;
	}
	/**
	 * @param optType the optType to set
	 */
	public void setOptType(OptType optType) {
		this.optType = optType;
	}
	

}
