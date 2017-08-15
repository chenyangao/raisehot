/**   
 * @Title: OptRecordServiceImpl.java
 * @Package:com.hottop.raisehot.service.impl2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日下午2:38:47 
 * @version V1.0   
 */
package com.hottop.raisehot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hottop.raisehot.dao.OptRecordDao;
import com.hottop.raisehot.model.OptRecord;
import com.hottop.raisehot.model.WorkOrder;
import com.hottop.raisehot.model.WorkTask;
import com.hottop.raisehot.service.OptRecordService;

/**
 * @ClassName: OptRecordServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日下午2:38:47
 *
 * 
 */
@Transactional
@Service("optRecordService")
public class OptRecordServiceImpl implements OptRecordService {
	@Autowired
	private OptRecordDao optRecordDao;
	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.OptRecordService#addOptRecord(com.hottop.raisehot.model.OptRecord)
	 */
	@Override
	public void addOptRecord(OptRecord optRecord) {
		optRecordDao.insertOptRecord(optRecord);
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.OptRecordService#viewOptRecord(com.hottop.raisehot.model.WorkOrder)
	 */
	@Override
	public List<OptRecord> viewOptRecord(WorkOrder workOrder) {
		OptRecord optRecord = null ;
		return optRecordDao.queryOptRecord(optRecord);
	}

	/* (non-Javadoc)
	 * @see com.hottop.raisehot.service.OptRecordService#viewOptRecord(com.hottop.raisehot.model.WorkTask)
	 */
	@Override
	public List<OptRecord> viewOptRecord(WorkTask workTask) {
	     OptRecord optRecord = null ;
		 return optRecordDao.queryOptRecord(optRecord);
	}

}
