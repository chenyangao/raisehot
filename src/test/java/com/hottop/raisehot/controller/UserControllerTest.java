/**   
 * @Title: UserControllerTest.java
 * @Package:com.hottop.raisehot2017年7月21日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月21日下午3:42:15 
 * @version V1.0   
 */
package com.hottop.raisehot.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @ClassName: UserControllerTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月21日下午3:42:15
 *
 * 
 */ 
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    private MockMvc mvc;
    
    @Test
    public void login() throws UnsupportedEncodingException, Exception{
    	 mvc.perform( post("/user/login.do")    //请求的url,请求的方法是get
     			.characterEncoding("UTF-8")
     			.contentType(MediaType.APPLICATION_JSON)  //数据的格式
     			.param("phoneNumber","18516029987").param("password", "123456")         //添加参数
     			).andExpect(status().isOk())    //返回的状态是200
     			.andDo(print())         //打印出请求和相应的内容
     			.andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串

    }
    @Test
    public void sendMessage() throws  Exception{
    	mvc.perform(post("/user/login.do")    //请求的url,请求的方法是get
    			.characterEncoding("UTF-8")
    			.contentType(MediaType.APPLICATION_JSON)  //数据的格式
    			.param("phoneNumber","18516029987")         //添加参数
    			).andExpect(status().isOk())    //返回的状态是200
    	.andDo(print())         //打印出请求和相应的内容
    	.andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }
    
    @Test
    public void preview() throws Exception {
    	  mvc.perform( post("/user/preview.do")    //请求的url,请求的方法是get
    			.characterEncoding("UTF-8")
    			.contentType(MediaType.APPLICATION_JSON)  //数据的格式
    			.param("id","349220517430951936")         //添加参数
    			).andExpect(status().isOk())    //返回的状态是200
    			.andDo(print())         //打印出请求和相应的内容
    			.andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }

    @Test
    public void greetingWithUser() throws Exception {
        mvc.perform(get("/greeting").param("name", "Greg"))
                .andExpect(content().string(containsString("Hello, Greg!")));
    }
    

    @Test  
    public void testRegisterMockMvc() throws Exception {  
        mvc.perform((get("http://localhost:8080/raisehot/user/register.do").param("userName", "admin").param("password", "123"))).andExpect(status().isOk()).andDo(print());
    }
    @Test  
    public void testPostUserMockMvc() throws Exception {  
    	mvc.perform((post("/test").param("userName", "admin").param("password", "123"))).andExpect(status().isOk()).andDo(print());
    } 
    @Test
    public void demo() throws Exception {
        mvc.perform(get("/demo/test").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
               .andExpect(status().isOk())
               .andExpect(content().contentType("application/json;charset=UTF-8"))
               .andExpect(content().string("{'foo':'bar'}"));
    }
    @Test  
    public void testLoginMockMvc() throws Exception {  
        mvc.perform((post("/loginTest").param("userName", "admin").param("password", "123"))).andExpect(status().isOk()).andDo(print());
    }
   @Test
   public void testHome() throws Exception {
       mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/raisehot/user/preview.do"))
       .andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("bookhome"));
   }
}
