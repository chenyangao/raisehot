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
    protected Long            id;

    /**  
     * @Fields status :记录的状态  
     */  
    protected String          status;

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
	protected Date            createTime;

	/**  
	 * @Fields lastModifyTime : 最后修改时间 
	 */  
	protected Date            lastModifyTime;

    /**  
     * @Fields startDate : 开始日期 
     */  
    protected Date            startDate;

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
	 * <b>PO推荐实现的方法toString</b>
	 * toString()方法用于给出该对象的描述信息，因此也推荐重写该方法（Hibernate并没有硬性规定）
	 */
	public abstract String toString();
}
