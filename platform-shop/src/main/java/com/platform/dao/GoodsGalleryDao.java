package com.platform.dao;

import com.platform.entity.GoodsGalleryEntity;

import java.util.Map;

/**
 * Dao
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-23 14:41:43
 */
public interface GoodsGalleryDao extends BaseDao<GoodsGalleryEntity> {
    int deleteByGoodsId(Map<String, Integer> map);
}
