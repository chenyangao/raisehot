/**   
 * @Title: OptRecord.java
 * @Package:com.hottop.raisehot.model2017年7月25日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月25日下午5:58:29 
 * @version V1.0   
 */
package com.hottop.raisehot.model;

import com.hottop.raisehot.model.enumvalue.OptType;

/**
 * @ClassName: OptRecord
 * @Description: 任务操作记录表
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月25日下午5:58:29
 *
 * 
 */
public class OptRecord extends BaseModel {
	/**  
	 * @Fields optType : TODO(用一句话描述这个变量表示什么)  
	 */  
	OptType optType ;

	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 2378736221789658873L;

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

	/**   
	 * @Title: main   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}