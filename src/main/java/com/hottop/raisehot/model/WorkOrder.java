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
	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 4439015418492646288L;
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
	public List<String> getUserLevel() {
		return userLevel;
	}

	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(List<String> userLevel) {
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
	 * @return the workTasks
	 */
	public List<WorkTasks> getWorkTasks() {
		return workTasks;
	}

	/**
	 * @param workTasks the workTasks to set
	 */
	public void setWorkTasks(List<WorkTasks> workTasks) {
		this.workTasks = workTasks;
	}

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
