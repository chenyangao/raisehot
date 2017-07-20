/**   
 * @Title: HttpTest.java
 * @Package:com.hottop.raisehot2017年7月9日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月9日上午10:18:29 
 * @version V1.0   
 */
package com.hottop.raisehot;

import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: HttpTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月9日上午10:18:29
 *
 * 
 */
public class ControllerHttpTest {
	@Test
	public void httpTest1(){
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("userName", "cyg");
		form.add("password", "123456");
		form.add("age", "12");
		String url = "http://localhost:8080/raisehot/user/userregister.do";
		restTemplate.postForLocation(url , form);
	}

}
