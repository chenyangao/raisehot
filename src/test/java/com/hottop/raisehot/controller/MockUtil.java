/**   
 * @Title: MockUtil.java
 * @Package:com.hottop.raisehot.mockmvc2017年7月9日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月9日下午4:41:23 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.io.UnsupportedEncodingException;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @ClassName: MockUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月9日下午4:41:23
 *
 * 
 */
public class MockUtil {

	/**
	 * mock
	 * 
	 * @param uri
	 * @param json
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static String mock(MockMvc mvc, String uri, String json)
			throws UnsupportedEncodingException, Exception {
		return mvc .perform( post(uri, "json").characterEncoding("UTF-8") .contentType(MediaType.APPLICATION_JSON) .content(json.getBytes())).andReturn()
				.getResponse().getContentAsString();
	}

	
	/**
	 * 
	 * @param re 返回值
	 * @param object 要转换的对象
	 * @param testName 当前测试的对象
	 */
	public static <T> void check(String re, Class<T> object,String testName) {
		/*System.out.println(re);
		if (ErrorType.error500.toString().equals(re)) {
			System.out.println("-----该接口测试失败：-----"
					+ testName);
			fail(re);
		} else if (CommConstants.OK_MARK.toString().equals(re)) {
			System.out.println("-----该接口测试成功：-----"
					+ testName);
		}else{
			System.out.println("-----re----- :"+re);
		}
		if (object != null) {
			if (re.contains(":")) {
				try {
					T t = PojoMapper.fromJsonAsObject(re, object);
					System.out.println("-----该接口测试成功：-----"
							+ testName);
				} catch (Exception e) {
					System.out.println("-----该接口测试失败：-----"
							+ testName);
					fail(e.getMessage());
				}
			}
		}*/

	}


	/**
	 * 初始化版本信息。每次调用测试用力之前首先更新版本信息
	 * @param mockMvc
	 * @param url
	 * @param fileId
	 * @param class1
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static <T> Long updateVersion(MockMvc mockMvc, String url,
			Long fileId, Class<T> class1) throws UnsupportedEncodingException, Exception {
				return fileId;
	/*	
		String re = mock(mockMvc, url, fileId+"");
		
		T dto = PojoMapper.fromJsonAsObject(re, class1);
		Long version = Long.parseLong(dto.getClass().getMethod("getVersion").invoke(dto).toString());	
		System.out.println("version = "+version);
		
		return version;*/
	}
	
}
