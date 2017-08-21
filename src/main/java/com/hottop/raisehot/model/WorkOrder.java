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
import java.util.Date;
import java.util.List;

import com.hottop.raisehot.model.enums.Status;
import com.hottop.raisehot.model.enums.WorkOrderStatus;

/**
 * @ClassName: WorkOrder
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午12:57:30
 *
 * 
 */
public class WorkOrder extends BaseModel {
	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 4439015418492646288L;
	/**  
	 * @Fields serialNo : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String serialNo;
	/**  
	 * @Fields jobType : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String jobType;
	/**  
	 * @Fields goldCoinSum : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer goldCoinSum;
	/**  
	 * @Fields taskCount : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer taskCount;
	/**  
	 * @Fields linkType : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String linkType;
	/**  
	 * @Fields userLevel : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String userLevel;
	/**  
	 * @Fields taskTime : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String taskTime;
	/**  
	 * @Fields comparativeOpt : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String comparativeOpt;
	/**  
	 * @Fields favoritesOpt : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String favoritesOpt;
	/**  
	 * @Fields chatOpt : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String chatOpt;
	/**  
	 * @Fields browseTime : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String browseTime;
	/**  
	 * @Fields otherRequirement : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String otherRequirement;
	/**  
	 * @Fields advancePrincipal : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer advancePrincipal;
	/**  
	 * @Fields additionalPrincipal : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer additionalPrincipal;
	
	private WorkOrderStatus workOrderStatus ;
	/**  
	 * @Fields workTasks : TODO(用一句话描述这个变量表示什么)  
	 */  
	private List<WorkTask> workTasks = new ArrayList<WorkTask>();

	/**
	 * @return the goldCoinSum
	 */
	public Integer getGoldCoinSum() {
		return goldCoinSum;
	}

	/**
	 * @param goldCoinSum the goldCoinSum to set
	 */
	public void setGoldCoinSum(Integer goldCoinSum) {
		this.goldCoinSum = goldCoinSum;
	}

	/**
	 * @return the taskCount
	 */
	public Integer getTaskCount() {
		return taskCount;
	}

	/**
	 * @param taskCount the taskCount to set
	 */
	public void setTaskCount(Integer taskCount) {
		this.taskCount = taskCount;
	}

	/**
	 * @return the linkType
	 */
	public String getLinkType() {
		return linkType;
	}

	/**
	 * @param linkType the linkType to set
	 */
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}
	/**
	 * @return the userLevel
	 */
	public String getUserLevel() {
		return userLevel;
	}

	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	/**
	 * @return the taskTime
	 */
	public String getTaskTime() {
		return taskTime;
	}

	/**
	 * @param taskTime the taskTime to set
	 */
	public void setTaskTime(String taskTime) {
		this.taskTime = taskTime;
	}

	/**
	 * @return the comparativeOpt
	 */
	public String getComparativeOpt() {
		return comparativeOpt;
	}

	/**
	 * @param comparativeOpt the comparativeOpt to set
	 */
	public void setComparativeOpt(String comparativeOpt) {
		this.comparativeOpt = comparativeOpt;
	}

	/**
	 * @return the favoritesOpt
	 */
	public String getFavoritesOpt() {
		return favoritesOpt;
	}

	/**
	 * @param favoritesOpt the favoritesOpt to set
	 */
	public void setFavoritesOpt(String favoritesOpt) {
		this.favoritesOpt = favoritesOpt;
	}

	/**
	 * @return the chatOpt
	 */
	public String getChatOpt() {
		return chatOpt;
	}

	/**
	 * @param chatOpt the chatOpt to set
	 */
	public void setChatOpt(String chatOpt) {
		this.chatOpt = chatOpt;
	}

	/**
	 * @return the browseTime
	 */
	public String getBrowseTime() {
		return browseTime;
	}

	/**
	 * @param browseTime the browseTime to set
	 */
	public void setBrowseTime(String browseTime) {
		this.browseTime = browseTime;
	}

	/**
	 * @return the otherRequirement
	 */
	public String getOtherRequirement() {
		return otherRequirement;
	}

	/**
	 * @param otherRequirement the otherRequirement to set
	 */
	public void setOtherRequirement(String otherRequirement) {
		this.otherRequirement = otherRequirement;
	}

	/**
	 * @return the advancePrincipal
	 */
	public Integer getAdvancePrincipal() {
		return advancePrincipal;
	}

	/**
	 * @param advancePrincipal the advancePrincipal to set
	 */
	public void setAdvancePrincipal(Integer advancePrincipal) {
		this.advancePrincipal = advancePrincipal;
	}

	/**
	 * @return the additionalPrincipal
	 */
	public Integer getAdditionalPrincipal() {
		return additionalPrincipal;
	}

	/**
	 * @param additionalPrincipal the additionalPrincipal to set
	 */
	public void setAdditionalPrincipal(Integer additionalPrincipal) {
		this.additionalPrincipal = additionalPrincipal;
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
	 * @return the workOrderStatus
	 */
	public WorkOrderStatus getWorkOrderStatus() {
		return workOrderStatus;
	}

	/**
	 * @param workOrderStatus the workOrderStatus to set
	 */
	public void setWorkOrderStatus(WorkOrderStatus workOrderStatus) {
		this.workOrderStatus = workOrderStatus;
	}

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WorkOrder [serialNo=" + serialNo + ", jobType=" + jobType + ", goldCoinSum=" + goldCoinSum
				+ ", taskCount=" + taskCount + ", linkType=" + linkType + ", userLevel=" + userLevel + ", taskTime="
				+ taskTime + ", comparativeOpt=" + comparativeOpt + ", favoritesOpt=" + favoritesOpt + ", chatOpt="
				+ chatOpt + ", browseTime=" + browseTime + ", otherRequirement=" + otherRequirement
				+ ", advancePrincipal=" + advancePrincipal + ", additionalPrincipal=" + additionalPrincipal
				+ ", workOrderStatus=" + workOrderStatus + ", workTasks=" + workTasks + "]";
	}

	/**
	 * @return the jobType
	 */
	public String getJobType() {
		return jobType;
	}

	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	/**
	 * @return the workTasks
	 */
	public List<WorkTask> getWorkTasks() {
		return workTasks;
	}

	/**
	 * @param workTasks the workTasks to set
	 */
	public void setWorkTasks(List<WorkTask> workTasks) {
		this.workTasks = workTasks;
	}

	/**  
	 * @Title: WorkOrder  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param id
	 * @param status
	 * @param creator
	 * @param modifier
	 * @param createTime
	 * @param updateTime
	 * @param startDate
	 * @param endDate
	 * @param version
	 * @param remark
	 * @param serialNo
	 * @param jobType
	 * @param goldCoinSum
	 * @param taskCount
	 * @param linkType
	 * @param userLevel
	 * @param taskTime
	 * @param comparativeOpt
	 * @param favoritesOpt
	 * @param chatOpt
	 * @param browseTime
	 * @param otherRequirement
	 * @param advancePrincipal
	 * @param additionalPrincipal
	 * @param workOrderStatus
	 * @param workTasks
	 */
	public WorkOrder(String id, Status status, User creator, User modifier, Date createTime, Date updateTime,
			Date startDate, Date endDate, int version, String remark, String serialNo, String jobType,
			Integer goldCoinSum, Integer taskCount, String linkType, String userLevel, String taskTime,
			String comparativeOpt, String favoritesOpt, String chatOpt, String browseTime, String otherRequirement,
			Integer advancePrincipal, Integer additionalPrincipal, WorkOrderStatus workOrderStatus,
			List<WorkTask> workTasks) {
		super(id, status, creator, modifier, createTime, updateTime, startDate, endDate, version, remark);
		this.serialNo = serialNo;
		this.jobType = jobType;
		this.goldCoinSum = goldCoinSum;
		this.taskCount = taskCount;
		this.linkType = linkType;
		this.userLevel = userLevel;
		this.taskTime = taskTime;
		this.comparativeOpt = comparativeOpt;
		this.favoritesOpt = favoritesOpt;
		this.chatOpt = chatOpt;
		this.browseTime = browseTime;
		this.otherRequirement = otherRequirement;
		this.advancePrincipal = advancePrincipal;
		this.additionalPrincipal = additionalPrincipal;
		this.workOrderStatus = workOrderStatus;
		this.workTasks = workTasks;
	}
	/**  
	 * @Title: BaseModel  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param id
	 */
	public WorkOrder(String id) {
		super(id);
	}

	/**  
	 * @Title: WorkOrder  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 */
	public WorkOrder() {
		// TODO Auto-generated constructor stub
	}
}
