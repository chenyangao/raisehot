/**   
 * @Title: WorkOrderTest.java
 * @Package:com.hottop.raisehot2017年8月3日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月3日下午4:10:28 
 * @version V1.0   
 */
package com.hottop.raisehot;

import java.text.MessageFormat;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hottop.raisehot.model.User;
import com.hottop.raisehot.model.WorkOrder;
import com.hottop.raisehot.model.enumvalue.OptType;
import com.hottop.raisehot.service.WorkOrderService;
import com.hottop.raisehot.util.SnowflakeIdWorker;

/**
 * @ClassName: WorkOrderTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月3日下午4:10:28
 *
 * 
 */
public class WorkOrderTest extends BaseService {
	protected final Logger       logger = LoggerFactory.getLogger(this.getClass());
	private static WorkOrderService workOrderService;
	 private static 		User creator;

	@BeforeClass
	  public static void setUp(){
		creator = new User();
	  }
	@Test
	public void addWorkOrder() {
		logger.debug("addWorkOrder() - start");

		WorkOrder workOrder = new WorkOrder();
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
		String id = String.valueOf(idWorker.nextId());
		workOrder.setId(id);
		workOrder.setCreator(creator);
		workOrder.setCreateTime(new java.util.Date());
		workOrder.setUpdateTime(new java.util.Date());
		
		workOrder.setStartDate(new java.util.Date());
		workOrder.setEndDate(new java.util.Date());
		WorkOrder WorkOrderRs = workOrderService.workOrderRelease(workOrder);
		logger.info(MessageFormat.format("用户信息:{0} ",WorkOrderRs.toString()));
		logger.debug("addWorkOrder() - end");
	}
	@Test
	public void workOrderOpt() {
		logger.info("WorkOrderOpt() - start");
		OptType optType = OptType.valueOf("opt") ;
		workOrderService.workOrderChange("339444585916792832", optType);
		logger.info("WorkOrderOpt() - end");
	} 
	@Test
	public void getAllWorkOrder(){
		WorkOrder workOrder = new WorkOrder() ;
		List<WorkOrder> WorkOrderList = workOrderService.getAllWorkOrder(workOrder);
		for (int i = 0; i < WorkOrderList.size(); i++) {
			logger.info(MessageFormat.format("用户信息:{0} ",WorkOrderList.get(i).toString()));
		}
	}
}
