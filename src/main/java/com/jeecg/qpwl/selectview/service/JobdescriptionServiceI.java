package com.jeecg.qpwl.selectview.service;
import com.jeecg.qpwl.selectview.entity.JobdescriptionEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface JobdescriptionServiceI extends CommonService{
	
 	public void delete(JobdescriptionEntity entity) throws Exception;
 	
 	public Serializable save(JobdescriptionEntity entity) throws Exception;
 	
 	public void saveOrUpdate(JobdescriptionEntity entity) throws Exception;
 	
}
