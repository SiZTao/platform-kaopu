package com.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.platform.dao.CmsArticleDao;
import com.platform.entity.CmsArticleEntity;
import com.platform.service.CmsArticleService;

/**
 * Service实现类
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
@Service("cmsArticleService")
public class CmsArticleServiceImpl implements CmsArticleService {
    @Autowired
    private CmsArticleDao cmsArticleDao;

    @Override
    public CmsArticleEntity queryObject(Integer id) {
        return cmsArticleDao.queryObject(id);
    }

    @Override
    public List<CmsArticleEntity> queryList(Map<String, Object> map) {
        return cmsArticleDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return cmsArticleDao.queryTotal(map);
    }

    @Override
    public int save(CmsArticleEntity cmsArticle) {
        return cmsArticleDao.save(cmsArticle);
    }

    @Override
    public int update(CmsArticleEntity cmsArticle) {
        return cmsArticleDao.update(cmsArticle);
    }

    @Override
    public int delete(Integer id) {
        return cmsArticleDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[]ids) {
        return cmsArticleDao.deleteBatch(ids);
    }
}
