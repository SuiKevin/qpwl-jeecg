package com.jeecg.qpwl.selectview.service;
import com.jeecg.qpwl.selectview.entity.JobEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface JobServiceI extends CommonService{
	
 	public void delete(JobEntity entity) throws Exception;
 	
 	public Serializable save(JobEntity entity) throws Exception;
 	
 	public void saveOrUpdate(JobEntity entity) throws Exception;
 	
}
