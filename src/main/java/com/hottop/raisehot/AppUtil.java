/**   
 * @Title: AppUtil.java
 * @Package:com.hottop.raisehot2017年7月2日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年7月2日下午10:37:44 
 * @version V1.0   
 */
package com.hottop.raisehot;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName: AppUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年7月2日下午10:37:44
 *
 * 
 */
public class AppUtil implements ApplicationContextAware {
	private static ApplicationContext appContext;

	@Override
	public void setApplicationContext(ApplicationContext paramApplicationContext) throws BeansException {
		appContext = paramApplicationContext;
	}

	public static Object getBean(String paramString) {
		return appContext.getBean(paramString);
	}
	
}
