/**   
 * @Title: OptRecord.java
 * @Package:com.hottop.raisehot.model2017年7月25日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月25日下午5:58:29 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

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
	
	public enum OptType {
		/**  
		 * @Fields Enable : TODO(用一句话描述这个变量表示什么)  
		 */  
		Enable("Enable", "启用"),
		/**  
		 * @Fields Disable : TODO(用一句话描述这个变量表示什么)  
		 */  
		Disable("Disable", "停用"),
		/**  
		 * @Fields Frozen : TODO(用一句话描述这个变量表示什么)  
		 */  
		Frozen("Frozen", "冻结"),
	    ;
	 
		/**  
		 * @Fields code : 编码  
		 */  
		private String code ;
		/**  
		 * @Fields desc : 描述  
		 */  
		private String desc ;
	    /**  
		 * @Title: Status  
		 * @Description: TODO(这里用一句话描述这个方法的作用)  
		 * @param code
		 * @param desc
		 */
		private OptType(String code, String desc) {
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
	    public static OptType getEnums(String code) {
	        for (OptType enums : values()) {
	            if (code.equals(enums.getCode())) {
	                return enums;
	            }
	        }
	        return null;
	    }
	    public String toString() {
	    	 return "{\"code\":\"" + this.code+ "\",\"text\":\"" + desc +"\"}";
	    }
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
