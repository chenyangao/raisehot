/**   
 * @Title: WorkTasks.java
 * @Package:com.hottop.raisehot.model2017年7月8日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月8日上午12:58:15 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import com.hottop.raisehot.model.enumvalue.TaskStatus;

/**
 * @ClassName: WorkTasks
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午12:58:15
 *
 * 
 */
public class WorkTasks extends BaseModel {
	
	private TaskStatus taskStatus ;
	private User orderUser ;
	
	
    /**   
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 7747898440138633287L;
	private WorkOrder workOrder;
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
