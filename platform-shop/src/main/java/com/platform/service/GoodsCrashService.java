package com.platform.service;

import com.platform.entity.GoodsCrashEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品搭配减Service接口
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-30 18:35:41
 */
public interface GoodsCrashService {

    /**
     * 根据主键查询实体
     *
     * @param id 主键
     * @return 实体
     */
    GoodsCrashEntity queryObject(Integer id);

    /**
     * 分页查询
     *
     * @param map 参数
     * @return list
     */
    List<GoodsCrashEntity> queryList(Map<String, Object> map);

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
     * @param goodsCrash 实体
     * @return 保存条数
     */
    int save(GoodsCrashEntity goodsCrash);

    /**
     * 根据主键更新实体
     *
     * @param goodsCrash 实体
     * @return 更新条数
     */
    int update(GoodsCrashEntity goodsCrash);

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
    int deleteBatch(Integer[] ids);
}
