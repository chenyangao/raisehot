/**   
 * @Title: Status.java
 * @Package:com.hottop.raisehot.model.enumvalue2017年8月6日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月6日上午10:40:24 
 * @version V1.0   
 */
package com.hottop.raisehot.model.enums;

/**
 * @ClassName: Status
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月6日上午10:40:24
 *
 * 
 */
public enum Status {
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
	private Status(String code, String desc) {
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
    public static Status getEnums(String code) {
        for (Status enums : values()) {
            if (code.equals(enums.getCode())) {
                return enums;
            }
        }
        return null;
    }
    /*public String toString() {
    	 return "{\"code\":\"" + this.code+ "\",\"text\":\"" + desc +"\"}";
    }*/
}
