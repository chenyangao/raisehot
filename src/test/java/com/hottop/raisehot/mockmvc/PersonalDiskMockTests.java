/**   
 * @Title: PersonalDiskMockTests.java
 * @Package:com.hottop.raisehot.mockmvc2017年7月9日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月9日下午4:32:09 
 * @version V1.0   
 */
package com.hottop.raisehot.mockmvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.hottop.raisehot.service.UserService;

/**
 * @ClassName: PersonalDiskMockTests
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月9日下午4:32:09
 *
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonalDiskMockTests extends AbstractContextControllerTests {

	private static String URI = "";

	private MockMvc mockMvc;

	private String json = "{\"entId\":1234,\"userId\":1235,\"key\":\"new\"}";

	@Autowired
	private UserService userService;

	@Before
	public void setup() {
		// this.mockMvc =
		// webAppContextSetup(this.wac).alwaysExpect(status().isOk()).build();
		this.mockMvc = MockMvcBuilders.standaloneSetup(userService).build();
	}

	@Test
	public void readJson() throws Exception {
		this.mockMvc.perform(post(URI, "json").characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON) .content(json.getBytes()))
				.andExpect(content().string("Read from JSON: JavaBean {foo=[bar], fruit=[apple]}"));
	}
}