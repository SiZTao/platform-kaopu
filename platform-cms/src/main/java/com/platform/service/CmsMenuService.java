package com.platform.service;

import com.platform.entity.CmsMenuEntity;

import java.util.List;
import java.util.Map;

/**
 * Service接口
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2018-03-24 11:27:54
 */
public interface CmsMenuService {

    /**
     * 根据主键查询实体
     *
     * @param id 主键
     * @return 实体
     */
    CmsMenuEntity queryObject(Integer id);

    /**
     * 分页查询
     *
     * @param map 参数
     * @return list
     */
    List<CmsMenuEntity> queryList(Map<String, Object> map);

    /**
     * 分页统计总数
     *
     * @param map 参数
     * @return 总数
     */
    int queryTotal(Map<String, Object> map);

    /**
     * 保存实体
     *
     * @param cmsMenu 实体
     * @return 保存条数
     */
    int save(CmsMenuEntity cmsMenu);

    /**
     * 根据主键更新实体
     *
     * @param cmsMenu 实体
     * @return 更新条数
     */
    int update(CmsMenuEntity cmsMenu);

    /**
     * 根据主键删除
     *
     * @param id
     * @return 删除条数
     */
    int delete(Integer id);

    /**
     * 根据主键批量删除
     *
     * @param ids
     * @return 删除条数
     */
    int deleteBatch(Integer[]ids);
}
