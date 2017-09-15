/**   
 * @Title: LogbackTest.java
 * @Package:com.hottop.raisehot.logback2017年7月24日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月24日下午2:26:22 
 * @version V1.0   
 */
package com.hottop.raisehot.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: LogbackTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月24日下午2:26:22
 *
 * 
 */
public class LogbackTest {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 */
	private final static Logger logger = LoggerFactory.getLogger(LogbackTest.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("logback 成功了");
		logger.error("logback 成功了");
		logger.debug("logback 成功了");

	}

}
