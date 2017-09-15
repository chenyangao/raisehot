/**   
 * @Title: TransactionRecord.java
 * @Package:com.hottop.raisehot.model2017年7月8日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月8日上午1:04:19 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

/**
 * @ClassName: TransactionRecord
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午1:04:19
 *
 * 
 */
public class TransactionRecord extends BaseModel {
	
	/**  
	 * @Title: TransactionRecord  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param id
	 */
	public TransactionRecord(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	/**  
	 * @Fields transactionType : TODO(用一句话描述这个变量表示什么)  
	 */  
	private TransactionType transactionType ;
	
	public enum TransactionType {

	}
	/**  
	 * @Fields glodCoinsSmount : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer glodCoinsSmount ;

	
	/**
	 * @return the transactionType
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @return the glodCoinsSmount
	 */
	public Integer getGlodCoinsSmount() {
		return glodCoinsSmount;
	}

	/**
	 * @param glodCoinsSmount the glodCoinsSmount to set
	 */
	public void setGlodCoinsSmount(Integer glodCoinsSmount) {
		this.glodCoinsSmount = glodCoinsSmount;
	}

	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 5380082681293045672L;

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
