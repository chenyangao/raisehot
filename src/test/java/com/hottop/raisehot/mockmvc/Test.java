/**   
 * @Title: Test.java
 * @Package:com.hottop.raisehot.mockmvc2017年7月9日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月9日下午9:34:59 
 * @version V1.0   
 */
package com.hottop.raisehot.mockmvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.hottop.raisehot.TestBase;

/**
 * @ClassName: Test
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月9日下午9:34:59
 *
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:root-context.xml, classpath*:conf/spring.xml,classpath*:conf/spring-mybatis.xml,classpath*:conf/spring-mvc.xml"})
//配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//@Transactional
@WebAppConfiguration
public class Test {
	//记得配置log4j.properties ,的命令行输出水平是debug
    protected Log logger= LogFactory.getLog(TestBase.class);

    protected MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext wac;

    @Before()  //这个方法在每个方法执行之前都会执行一遍
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
    }

    @org.junit.Test
    public void getAllCategoryTest() throws Exception {
        String responseString = mockMvc.perform( get("/raisehot/html")    //请求的url,请求的方法是get
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式
                        .param("pcode","root")         //添加参数
        ).andExpect(status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
        System.out.println("--------返回的json = " + responseString);
    }
    @org.junit.Test
    public void getAllGetCategoryTest() throws Exception {
    	String responseString = mockMvc.perform(get("/raisehot/html")    //请求的url,请求的方法是get
    			.contentType(MediaType.APPLICATION_FORM_URLENCODED)  //数据的格式
    			.param("pcode","root")         //添加参数
    			).andExpect(status().isOk())    //返回的状态是200
    			.andDo(print())         //打印出请求和相应的内容
    			.andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    	System.out.println("--------返回的json = " + responseString);
    }
    @org.junit.Test
    public void getAllPostCategoryTest() throws Exception {
    	String responseString = mockMvc.perform( post("/raisehot/postJson")    //请求的url,请求的方法是get
    			.contentType(MediaType.APPLICATION_JSON)  //数据的格式
    			.param("pcode","root")         //添加参数
    			).andExpect(status().isOk())    //返回的状态是200
    			.andDo(print())         //打印出请求和相应的内容
    			.andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    	System.out.println("--------返回的json = " + responseString);
    }
}
