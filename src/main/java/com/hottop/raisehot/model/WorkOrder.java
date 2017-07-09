/**   
 * @Title: WorkOrder.java
 * @Package:com.hottop.raisehot.model2017年7月8日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月8日上午12:57:30 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: WorkOrder
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午12:57:30
 *
 * 
 */
public class WorkOrder extends BaseModel {
	private Integer goldCoinSum;
	private Integer taskCount;
	private String linkType;
	private List<String> userLevel;
	private String taskTime;
	private String comparativeOpt;
	private String favoritesOpt;
	private String chatOpt;
	private String browseTime;
	private String otherRequirement;
	private Integer advancePrincipal;
	private Integer additionalPrincipal;

	private List<WorkTasks> workTasks = new ArrayList<WorkTasks>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hottop.raisehot.model.BaseModel#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hottop.raisehot.model.BaseModel#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hottop.raisehot.model.BaseModel#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
