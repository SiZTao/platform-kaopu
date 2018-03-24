package com.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.platform.dao.CmsMenuDao;
import com.platform.entity.CmsMenuEntity;
import com.platform.service.CmsMenuService;

/**
 * Service实现类
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
@Service("cmsMenuService")
public class CmsMenuServiceImpl implements CmsMenuService {
    @Autowired
    private CmsMenuDao cmsMenuDao;

    @Override
    public CmsMenuEntity queryObject(Integer id) {
        return cmsMenuDao.queryObject(id);
    }

    @Override
    public List<CmsMenuEntity> queryList(Map<String, Object> map) {
        return cmsMenuDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return cmsMenuDao.queryTotal(map);
    }

    @Override
    public int save(CmsMenuEntity cmsMenu) {
        return cmsMenuDao.save(cmsMenu);
    }

    @Override
    public int update(CmsMenuEntity cmsMenu) {
        return cmsMenuDao.update(cmsMenu);
    }

    @Override
    public int delete(Integer id) {
        return cmsMenuDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[]ids) {
        return cmsMenuDao.deleteBatch(ids);
    }
}
