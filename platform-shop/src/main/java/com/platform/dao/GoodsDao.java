package com.platform.dao;

import com.platform.entity.GoodsEntity;

/**
 * Dao
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-21 21:19:49
 */
public interface GoodsDao extends BaseDao<GoodsEntity> {
    Integer queryMaxId();
}
