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

import com.hottop.raisehot.model.OptRecord;
import com.hottop.raisehot.model.User;
import com.hottop.raisehot.model.WorkOrder;

/**
 * @ClassName: OptRecord
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日下午3:14:14
 *
 * 
 */
public class OptRecordServiceTest extends BaseService {
	OptRecord optRecord;
 	@Test
	public void addOptRecord(){ 
		optRecord = new OptRecord();
		optRecord.setCreator(new User("343706696922693632"));
 		optRecordService.addOptRecord(optRecord);;
		fail("Not yet implemented");
	}
 	@Test
 	public void viewOptRecord(){ 
 		WorkOrder workOrder = null;
		optRecordService.viewOptRecord(workOrder);
 		fail("Not yet implemented");
 	}
 	@Test
 	public void viewOptRecord2(){ 
 		WorkOrder workTask = null;
		optRecordService.viewOptRecord(workTask);
 		fail("Not yet implemented");
 	}

}
