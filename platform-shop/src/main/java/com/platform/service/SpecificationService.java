package com.platform.service;

import com.platform.entity.SpecificationEntity;

import java.util.List;
import java.util.Map;

/**
 * 规格表
 * 
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-13 10:41:10
 */
public interface SpecificationService {
	
	SpecificationEntity queryObject(Integer id);
	
	List<SpecificationEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SpecificationEntity specification);
	
	void update(SpecificationEntity specification);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
