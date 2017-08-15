/**   
 * @Title: MockMvcTest.java
 * @Package:com.hottop.raisehot2017年7月2日
 * @Description: 演示MockMVC使用 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日下午5:23:08 
 * @version V1.0   
 */
package com.hottop.raisehot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: MockMvcTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日下午5:23:08
 *
 */ 
public class MockMvcTest extends TestBase{
	
	@Autowired
	private WebApplicationContext webApplicationContext;

	// 一些公用的“初始化”代码
    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
	
    @Test  
    public void testRegisterMockMvc() throws Exception {  
        mockMvc.perform((get("http://localhost:8080/raisehot/user/register.do").param("userName", "admin").param("password", "123"))).andExpect(status().isOk()).andDo(print());
    }
    @Test  
    public void testPostUserMockMvc() throws Exception {  
    	mockMvc.perform((post("/test").param("userName", "admin").param("password", "123"))).andExpect(status().isOk()).andDo(print());
    } 
    @Test
    public void demo() throws Exception {
        mockMvc.perform(get("/demo/test").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
               .andExpect(status().isOk())
               .andExpect(content().contentType("application/json;charset=UTF-8"))
               .andExpect(content().string("{'foo':'bar'}"));
    }
    @Test  
    public void testLoginMockMvc() throws Exception {  
        mockMvc.perform((post("/loginTest").param("userName", "admin").param("password", "123"))).andExpect(status().isOk()).andDo(print());
    }


}