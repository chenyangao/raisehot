/**   
 * @Title: OutputJson.java
 * @Package:com.hottop.raisehot.util2017年7月19日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月19日下午3:31:17 
 * @version V1.0   
 */
package com.hottop.raisehot.util;

/**
 * @ClassName: OutputJson
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月19日下午3:31:17
 *
 * 
 */

import java.io.Serializable;

import com.alibaba.druid.support.json.JSONUtils;
 

public class OutputJson implements Serializable{

    /**
     * 返回客户端统一格式，包括状态码，提示信息，以及业务数据
     */
    private static final long serialVersionUID = 1L;
    //状态码
    private int status;
    //必要的提示信息
    private String message;
    //业务数据
    private Object data;

    public OutputJson(int status,String message,Object data){
        this.status = status;
        this.message = message;
        this.data = data;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String toString(){
        if(null == this.data){
            this.setData(new Object());
        }
        return JSONUtils.toJSONString(this);
    }
}