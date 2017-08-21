/**   
 * @Title: WorkTaskServicesTest.java
 * @Package:com.hottop.raisehot.service2017骞�8鏈�15鏃�
 * @Description: TODO(鐢ㄤ竴鍙ヨ瘽鎻忚堪璇ユ枃浠跺仛浠�涔�) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017骞�8鏈�15鏃ヤ笅鍗�3:13:03 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.model.WorkOrder;
import com.hottop.raisehot.model.WorkTask;
import com.hottop.raisehot.model.enumvalue.TaskStatus;
/**
 * @ClassName: WorkTaskServicesTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月16日下午5:40:49
 *
 * 
 */
public class WorkTaskServicesTest extends BaseService{
	/**
	* Logger for this class
	*/
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	WorkTaskServie workTaskServie;
	WorkTask workTask;
	
	 @Before 
	 public void before(){
			workTaskServie = (WorkTaskServie) context.getBean("workTaskServie");
	 }
	@Test
	public void receiveTask(){
		logger.debug("receiveTask() - start");
		workTask = new WorkTask();
		workTask.setWorkOrder(new WorkOrder("346712903568588800"));
		workTask.setCreator(new User("343706696922693632"));
		workTask.setModifier(new User("343706696922693632"));
		workTaskServie.receiveTask(workTask); 
		logger.info("receiveTask() - end");
 	}
	@Test
	public void completeTask(){
		logger.debug("completeTask() - start");
		workTaskServie.completeTask("347121130080829440", TaskStatus.Frozen); 
		logger.info("viewTaskList() - end");
	}
	@Test
	public void previewTask() {
		logger.debug("viewTaskList() - start");
		WorkTask workTask = workTaskServie.previewTask("347121130080829440"); 
		logger.info(workTask.toString());
	}
	@Test
	public void viewTaskList() { 
		List<WorkTask> work =  workTaskServie.viewTaskList(new WorkTask("347121130080829440"));
		for (int i = 0; i < work.size(); i++) {
			workTask  = (WorkTask) work.get(i);
			logger.info("viewTaskList()" +workTask.toString());
		}
	}

}
