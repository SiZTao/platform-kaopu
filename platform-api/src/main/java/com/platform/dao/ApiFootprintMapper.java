package com.platform.dao;

import com.platform.entity.FootprintVo;

import java.util.List;
import java.util.Map;

/**
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-11 09:14:26
 */
public interface ApiFootprintMapper extends BaseDao<FootprintVo> {
    int deleteByParam(Map<String, Object> map);

    List<FootprintVo> shareList(Map<String, Object> map);
}
