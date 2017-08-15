/**   
 * @Title: WorkTaskServicesTest.java
 * @Package:com.hottop.raisehot.service2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日下午3:13:03 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hottop.raisehot.model.WorkTask;
import com.hottop.raisehot.model.enumvalue.TaskStatus;

/**
 * @ClassName: WorkTaskServicesTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日下午3:13:03
 *
 * 
 */
public class WorkTaskServicesTest extends BaseService{
	WorkTask workTask;
    @Before 
    public void before() { 
    	workTask = new WorkTask();
    }
	@Test
	public void receiveTask() {
		workTaskServie.receiveTask(workTask); 
		fail("Not yet implemented");
	}
	@Test
	public void completeTask() { 
		workTaskServie.completeTask("", TaskStatus.Disable); 
		fail("Not yet implemented");
	}
	@Test
	public void previewTask() { 
		workTaskServie.previewTask(""); 
		fail("Not yet implemented");
	}
	@Test
	public void viewTaskList() { 
		workTaskServie.viewTaskList(workTask);
		fail("Not yet implemented");
	}

}
