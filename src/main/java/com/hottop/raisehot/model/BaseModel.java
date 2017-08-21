/**   
 * @Title: BaseModel.java
 * @Package:com.hottop.raisehot.model2017年7月2日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日下午1:53:42 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import java.io.Serializable;
import java.util.Date;

import com.hottop.raisehot.model.enumvalue.Status;

/**
 * @ClassName: BaseModel
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日下午1:53:42
 * 
 */
public abstract class BaseModel implements Serializable{
	private static final long serialVersionUID = -8326036523067527020L;

    /**  
     * @Fields id : 标识 
     */  
    protected String id;
 
    /**  
     * @Fields status : TODO(用一句话描述这个变量表示什么)  
     */  
    protected Status status;

    /**  
     * @Fields creator :  创建人 
     */  
    protected User        creator;

    /**  
     * @Fields modifier : 修改人  
     */  
    protected User        modifier;

    /* 创建日期 */
	/**  
	 * @Fields createTime :创建日期 
	 */  
	protected Date            createTime =  new Date();

	/**  
	 * @Fields lastModifyTime : 最后修改时间 
	 */  
	protected Date            updateTime = new Date();;

    /**  
     * @Fields startDate : 开始日期 
     */  
    protected Date            startDate =new Date();;

    /**  
     * @Fields endDate : 结束日期
     */  
    protected Date            endDate;

	/**  
	 * @Fields version :版本控制  
	 */  
	protected int             version;

    /**  
     * @Fields remark : 备注
     */  
    protected String          remark;
    
	/**  
	 * @Title: BaseModel  
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
	 */
	public BaseModel(String id, Status status, User creator, User modifier, Date createTime, Date updateTime,
			Date startDate, Date endDate, int version, String remark) {
		super();
		this.id = id;
		this.status = status;
		this.creator = creator;
		this.modifier = modifier;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.startDate = startDate;
		this.endDate = endDate;
		this.version = version;
		this.remark = remark;
	}

	/**  
	 * @Title: BaseModel  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param id
	 */
	public BaseModel(String id) {
		super();
		this.id = id;
	}
	/**  
	 * @Title: BaseModel  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 */
	public BaseModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the creator
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return the modifier
	 */
	public User getModifier() {
		return modifier;
	}

	/**
	 * @param modifier the modifier to set
	 */
	public void setModifier(User modifier) {
		this.modifier = modifier;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/* <b>PO推荐实现的方法equals</b>
	 * 关系数据库里面的记录可以由主键来唯一标识，但是用什么来标记两个对象”相等”呢？两个对象相等与否的判断很可能影响到数据的完整性
	 * 。如果在Hibernate无法自行制定两个对象相等与否的标准是，则需要用户之定义及重写equals()方法。
	 */
	public abstract boolean equals(Object object);

	/* (non-Javadoc)
	 * <b>PO推荐实现的方法hashCode</b>
	 * 如果希望将持久化对象放进Set里，或者重新接管已托管的持久化对象。则必须重写equals()和hashCode()
	 * 这两个方法，因为Java语法要去如果两个对象相等，那么它们的hashCode()返回值必须相等，因此该方法也需要重写。
	 */
	public abstract int hashCode();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseModel [id=" + id + ", status=" + status + ", creator=" + creator + ", modifier=" + modifier
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", version=" + version + ", remark=" + remark + "]";
	}
}
