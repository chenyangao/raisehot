/**   
 * @Title: JSONConverter.java
 * @Package:com.hottop.raisehot.controller2017年8月7日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月7日上午12:04:38 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @ClassName: JSONConverter
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月7日上午12:04:38
 *
 * 
 */
public class JSONConverter extends AbstractHttpMessageConverter<Object>{
	protected final Logger       logger = LoggerFactory.getLogger(this.getClass());

	    public final static Charset UTF8     = Charset.forName("UTF-8");

	    private Charset             charset  = UTF8;

	    private SerializerFeature[] features = new SerializerFeature[0];

	    public JSONConverter(){
	        super(new MediaType("application", "json", UTF8), new MediaType("application", "*+json", UTF8));
	    }

	    @Override
	    protected boolean supports(Class<?> clazz) {
	        return true;
	    }

	    public Charset getCharset() {
	        return this.charset;
	    }

	    public void setCharset(Charset charset) {
	        this.charset = charset;
	    }

	    public SerializerFeature[] getFeatures() {
	        return features;
	    }

	    public void setFeatures(SerializerFeature... features) {
	        this.features = features;
	    }

	    @Override
	    protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException,
	            HttpMessageNotReadableException {

	        ByteArrayOutputStream baos = new ByteArrayOutputStream();

	        InputStream in = inputMessage.getBody();

	        byte[] buf = new byte[1024];
	        for (;;) {
	            int len = in.read(buf);
	            if (len == -1) {
	                break;
	            }

	            if (len > 0) {
	                baos.write(buf, 0, len);
	            }
	        }

	        byte[] bytes = baos.toByteArray();
	        return JSON.parseObject(bytes, 0, bytes.length, charset.newDecoder(), clazz);
	    }

	    @Override
	    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
	        OutputStream out = outputMessage.getBody();
	        String text = JSON.toJSONString(obj, features);
	        byte[] bytes = text.getBytes(charset);
	        out.write(bytes);
	    }
	    
	    

}
