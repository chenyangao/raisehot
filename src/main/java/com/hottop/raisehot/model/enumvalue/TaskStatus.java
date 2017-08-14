/**   
 * @Title: TaskTaskStatus.java
 * @Package:com.hottop.raisehot.model2017年7月8日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月8日上午1:10:42 
 * @version V1.0   
 */
package com.hottop.raisehot.model.enumvalue;

/**
 * @ClassName: TaskTaskStatus
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月8日上午1:10:42
 *
 * 
 */
public enum TaskStatus {
	/**  
	 * @Fields Enable : TODO(用一句话描述这个变量表示什么)  
	 */  
	Enable("Enable", "发布"),
	/**  
	 * @Fields Disable : TODO(用一句话描述这个变量表示什么)  
	 */  
	Disable("Disable", "取消"),
	/**  
	 * @Fields Frozen : TODO(用一句话描述这个变量表示什么)  
	 */  
	Frozen("Frozen", "完成"),
    ;

    /* 编码 */

    /* 描述 */
	private String code ;
	private String desc ;
    /**  
	 * @Title: TaskStatus  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param code
	 * @param desc
	 */
	private TaskStatus(String code, String desc) {
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
    public static TaskStatus getEnums(String code) {
        for (TaskStatus enums : values()) {
            if (code.equals(enums.getCode())) {
                return enums;
            }
        }
        return null;
    }
}
