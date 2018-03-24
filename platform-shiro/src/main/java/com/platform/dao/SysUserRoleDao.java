package com.platform.dao;

import com.platform.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2016年9月18日 上午9:34:46
 */
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);
}
