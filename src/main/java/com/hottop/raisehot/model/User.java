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
