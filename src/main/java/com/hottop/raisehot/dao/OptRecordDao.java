/**   
 * @Title: OptRecordDao.java
 * @Package:com.hottop.raisehot.dao2017年8月15日
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author cyg(chenyangao@lakala.com)   
 * @date 2017年8月15日下午2:39:11 
 * @version V1.0   
 */
package com.hottop.raisehot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hottop.raisehot.model.OptRecord;

/**
 * @ClassName: OptRecordDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author cyg(chenyangao@lakala.com)
 * @date 2017年8月15日下午2:39:11
 *
 * 
 */
@Repository("optRecordDao")
public interface OptRecordDao {

	/**   
	 * @Title: queryOptRecord   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param optRecord
	 * @return
	 */  
	List<OptRecord> queryOptRecord(OptRecord optRecord);

	/**   
	 * @Title: insertOptRecord   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param optRecord
	 */  
	void insertOptRecord(OptRecord optRecord);

}
