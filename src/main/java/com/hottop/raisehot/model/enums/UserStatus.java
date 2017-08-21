/**   
 * @Title: Status.java
 * @Package:com.hottop.raisehot.model2017年7月8日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月8日上午12:41:00 
 * @version V1.0   
 */
package com.hottop.raisehot.model.enums;

/**
 * @ClassName: Status
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午12:41:00
 *
 * 
 */
public enum UserStatus {
	
	/**  
	 * @Fields Enable : TODO(用一句话描述这个变量表示什么)  
	 */  
	Enable("Enable", "启用"),
	/**  
	 * @Fields Disable : TODO(用一句话描述这个变量表示什么)  
	 */  
	Disable("Disable", "停用"),
	/**  
	 * @Fields Frozen : TODO(用一句话描述这个变量表示什么)  
	 */  
	Frozen("Frozen", "冻结"),
    ;
 
	/**  
	 * @Fields code : 编码  
	 */  
	private String code ;
	/**  
	 * @Fields desc : 描述  
	 */  
	private String desc ;
    /**  
	 * @Title: Status  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param code
	 * @param desc
	 */
	private UserStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

    /**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
    * 根据编码返回枚举值
    * @param code
    * @return
    */
    public static UserStatus getEnums(String code) {
        for (UserStatus enums : values()) {
            if (code.equals(enums.getCode())) {
                return enums;
            }
        }
        return null;
    }
}
