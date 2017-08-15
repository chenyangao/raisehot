/**   
 * @Title: WorkTaskServiesImpl.java
 * @Package:com.hottop.raisehot.service.impl2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日上午11:13:16 
 * @version V1.0   
 */
package com.hottop.raisehot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hottop.raisehot.dao.WorkTaskDao;
import com.hottop.raisehot.model.WorkTask;
import com.hottop.raisehot.model.enumvalue.TaskStatus;
import com.hottop.raisehot.service.WorkTaskServie;
import com.hottop.raisehot.util.SnowflakeIdWorker;

/**
 * @ClassName: WorkTaskServiesImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日上午11:13:16
 *
 * 
 */
@Transactional
@Service("workTaskServie")
public class WorkTaskServiesImpl implements WorkTaskServie {
@Autowired
	WorkTaskDao workTaskDao ;
	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkTaskServies#receiveTask(com.hottop.raisehot.model.WorkTask)
	 */
	@Override
	public WorkTask receiveTask(WorkTask workTask) {
		SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
		String id = String.valueOf(idWorker.nextId());
		workTask.setId(id);
		workTaskDao.insertTask(workTask);
		return workTaskDao.queryTaskById(id);
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkTaskServies#cancelTask(java.lang.String, com.hottop.raisehot.model.enumvalue.TaskStatus)
	 */
	@Override
	public void cancelTask(String id, TaskStatus taskStatus) {
		workTaskDao.updateTask(id,taskStatus);
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkTaskServies#completeTask(java.lang.String, com.hottop.raisehot.model.enumvalue.TaskStatus)
	 */
	@Override
	public void completeTask(String id, TaskStatus taskStatus) {
		workTaskDao.updateTask(id,taskStatus);
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkTaskServies#viewTaskList(com.hottop.raisehot.model.WorkTask)
	 */
	@Override
	public List<WorkTask> viewTaskList(WorkTask workTask) {
		return workTaskDao.queryTask(workTask);
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.WorkTaskServies#previewTask(java.lang.String)
	 */
	@Override
	public WorkTask previewTask(String id) {
		return workTaskDao.queryTaskById(id);
	}

}
