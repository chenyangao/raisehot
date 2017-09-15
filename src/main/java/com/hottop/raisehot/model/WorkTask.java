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

/**
 * @ClassName: 工作任务
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午12:58:15
 */
public class WorkTask extends BaseModel {
	
	/**  
	 * @Title: WorkTask  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param id
	 */
	public WorkTask(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	/**  
	 * @Title: WorkTask  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 */
	public WorkTask() {
		// TODO Auto-generated constructor stub
	}

	/**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 7747898440138633287L;
	/**  
	 * @Fields serialNo : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String serialNo;
	/**  
	 * @Fields workOrder : TODO(用一句话描述这个变量表示什么)  
	 */  
	private WorkOrder workOrder ;
	/**  
	 * @Fields taskStatus : 任务状态  
	 */  
	private Status taskStatus =Status.Release;
	/**  
	 * @Fields orderUser : TODO(用一句话描述这个变量表示什么)  
	 */  
	private User taskUser ;
	
	/**  
	 * @Fields optRecords : 操作记录 
	 */  
	private List<OptRecord> optRecords ;
	
	public enum Status {
		/**  
		 * @Fields Enable : TODO(用一句话描述这个变量表示什么)  
		 */  
		Release("Release", "发布"),
		/**  
		 * @Fields Disable : TODO(用一句话描述这个变量表示什么)  
		 */  
		Cancel("Cancel", "取消"),
		/**  
		 * @Fields Frozen : TODO(用一句话描述这个变量表示什么)  
		 */  
		Complete("Complete", "完成");

	    /* 编码 */

	    /* 描述 */
		private String code ;
		private String desc ;
	    /**  
		 * @Title: TaskStatus  
		 * @Description: TODO(这里用一句话描述这个方法的作用)  
		 * @param code
		 * @param desc
		 */
		private Status(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}

	    /**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}
		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}
		/**
	    * 根据编码返回枚举值
	    * @param code
	    * @return
	    */
	    public static Status getEnums(String code) {
	        for (Status enums : values()) {
	            if (code.equals(enums.getCode())) {
	                return enums;
	            }
	        }
	        return null;
	    }
	}
	/**
	 * @return the serialNo
	 */
	public String getSerialNo() {
		return serialNo;
	}

	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
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
	 * @return the taskStatus
	 */
	public Status getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(Status taskStatus) {
		this.taskStatus = taskStatus;
	}

	/**
	 * @return the taskUser
	 */
	public User getTaskUser() {
		return taskUser;
	}

	/**
	 * @param taskUser the taskUser to set
	 */
	public void setTaskUser(User taskUser) {
		this.taskUser = taskUser;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WorkTask [serialNo=" + serialNo + ", workOrder=" + workOrder + ", taskStatus=" + taskStatus
				+ ", taskUser=" + taskUser + ", optRecords=" + optRecords + "]";
	}

}
