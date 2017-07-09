/**   
 * @Title: TestBase.java
 * @Package:com.hottop.raisehot2017年7月2日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日下午5:07:37 
 * @version V1.0   
 */
package com.hottop.raisehot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @ClassName: TestBase
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日下午5:07:37
 *
 * 
 */

 
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath*:root-context.xml, classpath*:conf/spring.xml,classpath*:conf/spring-mybatis.xml,classpath*:conf/spring-mvc.xml"})
public class TestBase{
	protected Log logger = LogFactory.getLog(TestBase.class);
    public MockMvc mockMvc;
}
