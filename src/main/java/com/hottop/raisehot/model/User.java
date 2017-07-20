/**   
 * @Title: User.java
 * @Package:com.hottop.raisehot.model2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午8:55:50 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

/**
 * @ClassName: User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午8:55:50
 * 
 */
public class User extends BaseModel {
	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 8984069508293665378L;
	/**  
	 * @Fields phoneNumber : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String phoneNumber;
	/**  
	 * @Fields userType : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String userType;
	/**  
	 * @Fields nickname : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String nickname;
	/**  
	 * @Fields password : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String password;
	/**  
	 * @Fields isNumber : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String isNumber;
	/**  
	 * @Fields qq : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String qq;
	/**  
	 * @Fields locus : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String locus;
	/**  
	 * @Fields goldCoins : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer goldCoins;
	
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isNumber
	 */
	public String getIsNumber() {
		return isNumber;
	}

	/**
	 * @param isNumber the isNumber to set
	 */
	public void setIsNumber(String isNumber) {
		this.isNumber = isNumber;
	}

	/**
	 * @return the qq
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq the qq to set
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * @return the locus
	 */
	public String getLocus() {
		return locus;
	}

	/**
	 * @param locus the locus to set
	 */
	public void setLocus(String locus) {
		this.locus = locus;
	}

	/**
	 * @return the goldCoins
	 */
	public Integer getGoldCoins() {
		return goldCoins;
	}

	/**
	 * @param goldCoins the goldCoins to set
	 */
	public void setGoldCoins(Integer goldCoins) {
		this.goldCoins = goldCoins;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
