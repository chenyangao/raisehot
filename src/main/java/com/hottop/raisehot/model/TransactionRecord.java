/**   
 * @Title: TransactionRecord.java
 * @Package:com.hottop.raisehot.model2017年7月8日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月8日上午1:04:19 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import com.hottop.raisehot.model.enumvalue.TransactionType;

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
	 * @Fields transactionType : TODO(用一句话描述这个变量表示什么)  
	 */  
	private TransactionType transactionType ;
	/**  
	 * @Fields glodCoinsSmount : TODO(用一句话描述这个变量表示什么)  
	 */  
	private Integer glodCoinsSmount ;

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
