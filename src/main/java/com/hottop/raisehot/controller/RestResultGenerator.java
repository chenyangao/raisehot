/**   
 * @Title: RestResultGenerator.java
 * @Package:com.hottop.raisehot.controller2017年9月7日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年9月7日下午3:45:53 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: RestResultGenerator
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年9月7日下午3:45:53
 *
 * 
 */
public class RestResultGenerator {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestResultGenerator.class);
	private static Map<Integer, String> messageMap = new HashMap<Integer, String>();
	// 初始化状态码与文字说明
	static {
		messageMap.put(0, "");
		messageMap.put(400, "Bad Request!");
		messageMap.put(401, "NotAuthorization");
		messageMap.put(405, "Method Not Allowed");
		messageMap.put(406, "Not Acceptable");
		messageMap.put(500, "Internal Server Error");

		messageMap.put(1000, "[服务器]运行时异常");
		messageMap.put(1001, "[服务器]空值异常");
		messageMap.put(1002, "[服务器]数据类型转换异常");
		messageMap.put(1003, "[服务器]IO异常");
		messageMap.put(1004, "[服务器]未知方法异常");
		messageMap.put(1005, "[服务器]数组越界异常");
		messageMap.put(1006, "[服务器]网络异常");
		messageMap.put(1007, "[服务器]参数异常");

		messageMap.put(1010, "用户未注册");
		messageMap.put(1011, "用户已注册");
		messageMap.put(1012, "用户名或密码错误");
		messageMap.put(1013, "用户帐号冻结");
		messageMap.put(1014, "用户信息编辑失败");
		messageMap.put(1015, "用户信息失效，请重新获取");

		messageMap.put(1020, "验证码发送失败");
		messageMap.put(1021, "验证码失效");
		messageMap.put(1022, "验证码错误");
		messageMap.put(1023, "验证码不可用");
		messageMap.put(1029, "短信平台异常");

		messageMap.put(1030, "周边无店铺");
		messageMap.put(1031, "店铺添加失败");
		messageMap.put(1032, "编辑店铺信息失败");
		messageMap.put(1033, "每个用户只能添加一个商铺");
		messageMap.put(1034, "店铺不存在");

		messageMap.put(1040, "无浏览商品");
		messageMap.put(1041, "添加失败,商品种类超出上限");
		messageMap.put(1042, "商品不存在");
		messageMap.put(1043, "商品删除失败");

		messageMap.put(2010, "缺少参数或值为空");

		messageMap.put(2029, "参数不合法");
		messageMap.put(2020, "无效的Token");
		messageMap.put(2021, "无操作权限");
		messageMap.put(2022, "RSA解密失败,密文数据已损坏");
		messageMap.put(2023, "请重新登录");
	}
	/**
	 * * normal * @param success * @param data * @param message * @param <T>
	 * * @return
	 */
	public static <T> RestResult<T> genResult(boolean success, T data, String message) {
		RestResult<T> result = RestResult.newInstance();
		result.setResult(success);
		result.setData(data);
		result.setMessage(message);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("generate rest result:{}", result);
		}
		return result;
	}

	/** * success * @param data * @param <T> * @return */
	public static <T> RestResult<T> genSuccessResult(T data) {
		return genResult(true, data, null);
	}
	/** * error message * @param message error message * @param <T> * @return */
	public static <T> RestResult<T> genErrorResult(String message) {
		return genResult(false, null, message);
	}
	/**   
	 * @Title: genErrorResult   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param error
	 * @return
	 */  
	public static <T> RestResult<T> genErrorResult(int status) {
		return genErrorResult(messageMap.get(status));
	}
	/** * success no message * @return */
	public static RestResult genSuccessResult() {
		return genSuccessResult(null);
	}
}
