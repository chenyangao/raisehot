/**   
 * @Title: EnumCnSerializer.java
 * @Package:com.hottop.raisehot.controller2017年8月7日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月7日上午12:54:56 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.alibaba.fastjson.serializer.EnumSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

/**
 * @ClassName: EnumCnSerializer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月7日上午12:54:56
 *
 * 
 */
public class EnumCnSerializer<T extends Enum> extends EnumSerializer {

	private Class<T> clazz;
	private String[] proptertiesName;
	public EnumCnSerializer(Class<T> clazz,String ... proptertiesName) {
		super();
		this.clazz = clazz;
		this.proptertiesName = proptertiesName;
	}

	public void write(JSONSerializer serializer, Object object, 
			Object fieldName, Type fieldType) throws IOException {
		SerializeWriter out = serializer.getWriter();
        if (object == null) {
            serializer.getWriter().writeNull();
            return;
        }
		T e = clazz.cast(object) ;
        serializer.write(e.name());
        if(proptertiesName==null){
        	return;
        }
        for(String propertyName:proptertiesName){
        	propertyName = propertyName.substring(0,1).toUpperCase()+propertyName.substring(1);
        	try {
	        	Method method = clazz.getMethod("get" + propertyName);
	        	if(fieldName instanceof Integer){
		        	out.write(",");
		        	serializer.write(method.invoke(e));
		        }else{
			        out.write(",");
			        serializer.write(fieldName + propertyName);
			        out.write(":");
			        serializer.write(method.invoke(e));
		        }
        	} catch (Exception e1) {
    			return;
    		} 
        }
	}
}
