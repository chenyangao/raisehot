/**   
 * @Title: AllTests.java
 * @Package:com.hottop.raisehot.service2017年8月18日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月18日下午2:43:14 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @ClassName: AllTests
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月18日下午2:43:14
 *
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ OptRecordServiceTest.class, UserServiceTest.class, WorkOrderServiceTest.class, WorkTaskServicesTest.class })
public class AllTests {

}
