/**   
 * @Title: User.java
 * @Package:com.hottop.raisehot.model2017年7月1日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月1日下午8:55:50 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.hottop.raisehot.model.enums.Status;

/**
 * @ClassName: User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月1日下午8:55:50
 * 
 */
@Alias("user")
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
	private String nickName;
	/**  
	 * @Fields password : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String password;
 
	/**  
	 * @Fields wechatId : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String wechatId;
	/**  
	 * @Fields isNumber : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String isNumber;
	/**  
	 * @Fields isName : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String isName;
	/**  
	 * @Fields qq : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String qq;
	/**  
	 * @Fields locus : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String province;
	
	/**  
	 * @Fields goldCoins : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer goldCoins;
	/**  
	 * @Fields address : TODO(用一句话描述这个变量表示什么)  
	 */  
	private String address;

	/**  
	 * @Title: User  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param phoneNumber
	 * @param userType
	 * @param nickName
	 * @param wechatId
	 * @param isNumber
	 * @param isName
	 * @param qq
	 * @param province
	 * @param goldCoins
	 * @param address
	 */
	public User(String phoneNumber, String userType, String nickName, String wechatId, String isNumber, String isName,
			String qq, String province, Integer goldCoins, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.userType = userType;
		this.nickName = nickName;
		this.wechatId = wechatId;
		this.isNumber = isNumber;
		this.isName = isName;
		this.qq = qq;
		this.province = province;
		this.goldCoins = goldCoins;
		this.address = address;
	}

	/**  
	 * @Title: User  
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
	 * @param phoneNumber
	 * @param userType
	 * @param nickName
	 * @param wechatId
	 * @param isNumber
	 * @param isName
	 * @param qq
	 * @param province
	 * @param goldCoins
	 */
	public User(String id, Status status, User creator, User modifier, Date createTime, Date updateTime, Date startDate,
			Date endDate, int version, String remark, String phoneNumber, String userType, String nickName,
			String wechatId, String isNumber, String isName, String qq, String province, Integer goldCoins) {
		super(id, status, creator, modifier, createTime, updateTime, startDate, endDate, version, remark);
		this.phoneNumber = phoneNumber;
		this.userType = userType;
		this.nickName = nickName;
		this.wechatId = wechatId;
		this.isNumber = isNumber;
		this.isName = isName;
		this.qq = qq;
		this.province = province;
		this.goldCoins = goldCoins;
	}

	/**  
	 * @Title: User  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**  
	 * @Title: User  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param id
	 */
	public User(String id) {
		super(id);
	}

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
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	 * @return the wechatId
	 */
	public String getWechatId() {
		return wechatId;
	}

	/**
	 * @param wechatId the wechatId to set
	 */
	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
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
	 * @return the isName
	 */
	public String getIsName() {
		return isName;
	}

	/**
	 * @param isName the isName to set
	 */
	public void setIsName(String isName) {
		this.isName = isName;
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
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [phoneNumber=" + phoneNumber + ", userType=" + userType + ", nickName=" + nickName + ", password="
				+ password + ", wechatId=" + wechatId + ", isNumber=" + isNumber + ", isName=" + isName + ", qq=" + qq
				+ ", province=" + province + ", goldCoins=" + goldCoins + ", address=" + address + ", id=" + id
				+ ", status=" + status + ", creator=" + creator + ", modifier=" + modifier + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", version=" + version + ", remark=" + remark + "]";
	}
}
