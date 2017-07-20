/**   
 * @Title: AbstractContextControllerTests.java
 * @Package:com.hottop.raisehot.mockmvc2017年7月9日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月9日下午4:34:22 
 * @version V1.0   
 */
package com.hottop.raisehot.mockmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: AbstractContextControllerTests
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月9日下午4:34:22
 *
 * 
 */
@WebAppConfiguration
@ContextConfiguration(locations =  {"classpath*:root-context.xml, classpath*:conf/spring.xml,classpath*:conf/spring-mybatis.xml,classpath*:conf/spring-mvc.xml"})
public class AbstractContextControllerTests {
	@Autowired
	protected WebApplicationContext wac;
}
