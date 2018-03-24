package com.platform.service;

import com.platform.entity.CollectEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-13 10:41:06
 */
public interface CollectService {
	
	CollectEntity queryObject(Integer id);
	
	List<CollectEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CollectEntity collect);
	
	void update(CollectEntity collect);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
