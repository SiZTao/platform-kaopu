package com.platform.dao;

import com.platform.entity.CommentVo;

import java.util.Map;

/**
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017-08-11 09:14:26
 */
public interface ApiCommentMapper extends BaseDao<CommentVo> {
    int queryhasPicTotal(Map<String, Object> map);
}
