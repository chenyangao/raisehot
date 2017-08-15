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
public class ControllerRestHttpTest {
	/**   
	 * @Title: controllerRestHttpTest   
	 * @Description:成功了  
	 */  
	@Test
	public void controllerRestHttpTest(){
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> form = new LinkedMultiValueMap<String, String>();
		form.add("nickName", "cyg");
		form.add("password", "123456");
		form.add("age", "12");
		form.add("phoneNumber", "18516029987");
		form.add("userType", "1");
		form.add("isNumber", "160212499");
		form.add("isName", "火星人漂流");
		form.add("qq", "160212499");
		form.add("creator", "1");
		String url = "http://localhost:8080/raisehot/user/register.do";
		restTemplate.postForLocation(url , form);
	}

}
