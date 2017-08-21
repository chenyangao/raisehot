/**   
 * @Title: OptRecord.java
 * @Package:com.hottop.raisehot.service2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日下午3:14:14 
 * @version V1.0   
 */
package com.hottop.raisehot.service;

 
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hottop.raisehot.model.OptRecord;
import com.hottop.raisehot.model.User;
import com.hottop.raisehot.model.WorkOrder;
import com.hottop.raisehot.model.WorkTask;

/**
 * @ClassName: OptRecord
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日下午3:14:14
 *
 * 
 */
public class OptRecordServiceTest extends BaseService {

	@Autowired
	OptRecordService optRecordService;
	OptRecord optRecord;
	 @Before 
	 public void before(){
			optRecordService = (OptRecordService) context.getBean("optRecordService");
	 }
 	@Test
	public void addOptRecord(){ 
		optRecord = new OptRecord();
		optRecord.setCreator(new User("346966180939956224"));
		optRecord.setWorkOrder(new WorkOrder("346712903568588800"));
		optRecord.setWorkTask(new WorkTask("347121130080829440"));
 		optRecordService.addOptRecord(optRecord);;
	}
 	@Test
 	public void viewOptRecord(){ 
 		WorkOrder workOrder = null;
		optRecordService.viewOptRecord(workOrder);
 	}
 	@Test
 	public void viewOptRecord2(){ 
 		WorkOrder workTask = null;
		optRecordService.viewOptRecord(workTask);
 	}

}
