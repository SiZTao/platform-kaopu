package com.platform.service.impl;

import com.platform.dao.GoodsGroupDao;
import com.platform.entity.GoodsGroupEntity;
import com.platform.service.GoodsGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 团购Service实现类
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-09-06 17:18:30
 */
@Service("goodsGroupService")
public class GoodsGroupServiceImpl implements GoodsGroupService {
    @Autowired
    private GoodsGroupDao goodsGroupDao;

    @Override
    public GoodsGroupEntity queryObject(Integer id) {
        return goodsGroupDao.queryObject(id);
    }

    @Override
    public List<GoodsGroupEntity> queryList(Map<String, Object> map) {
        return goodsGroupDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return goodsGroupDao.queryTotal(map);
    }

    @Override
    public int save(GoodsGroupEntity goodsGroup) {
        return goodsGroupDao.save(goodsGroup);
    }

    @Override
    public int update(GoodsGroupEntity goodsGroup) {
        return goodsGroupDao.update(goodsGroup);
    }

    @Override
    public int delete(Integer id) {
        return goodsGroupDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return goodsGroupDao.deleteBatch(ids);
    }
}
