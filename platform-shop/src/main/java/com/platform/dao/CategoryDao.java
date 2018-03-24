package com.platform.dao;

import com.platform.entity.CategoryEntity;

/**
 * Dao
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-21 15:32:31
 */
public interface CategoryDao extends BaseDao<CategoryEntity> {

    public int deleteByParentBatch(Object[] id);
}
