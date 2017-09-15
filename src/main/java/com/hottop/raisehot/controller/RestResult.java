/**   
 * @Title: RestResult.java
 * @Package:com.hottop.raisehot.controller2017年9月7日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年9月7日下午3:42:05 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

/**
 * @ClassName: RestResult
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年9月7日下午3:42:05
 *
 * 
 */

public class RestResult<T> {
	private boolean result;
	private String message;
	private String url;
	private T data;

	private RestResult() {
	}

	public static <T> RestResult<T> newInstance() { 
		return new RestResult<T>(); 
	}

	/**
	 * @return the result
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(boolean result) {
		this.result = result;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RestResult [result=" + result + ", message=" + message + ", data=" + data + "]";
	}
}
 
