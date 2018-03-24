package com.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.platform.dao.CmsCategoryDao;
import com.platform.entity.CmsCategoryEntity;
import com.platform.service.CmsCategoryService;

/**
 * Service实现类
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
@Service("cmsCategoryService")
public class CmsCategoryServiceImpl implements CmsCategoryService {
    @Autowired
    private CmsCategoryDao cmsCategoryDao;

    @Override
    public CmsCategoryEntity queryObject(Integer id) {
        return cmsCategoryDao.queryObject(id);
    }

    @Override
    public List<CmsCategoryEntity> queryList(Map<String, Object> map) {
        return cmsCategoryDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return cmsCategoryDao.queryTotal(map);
    }

    @Override
    public int save(CmsCategoryEntity cmsCategory) {
        return cmsCategoryDao.save(cmsCategory);
    }

    @Override
    public int update(CmsCategoryEntity cmsCategory) {
        return cmsCategoryDao.update(cmsCategory);
    }

    @Override
    public int delete(Integer id) {
        return cmsCategoryDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[]ids) {
        return cmsCategoryDao.deleteBatch(ids);
    }
}
