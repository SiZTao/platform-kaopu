package com.platform.dao;

import com.platform.entity.GoodsAttributeEntity;

/**
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-13 10:41:08
 */
public interface GoodsAttributeDao extends BaseDao<GoodsAttributeEntity> {

    int updateByGoodsIdAttributeId(GoodsAttributeEntity goodsAttributeEntity);
}
