package com.platform.service;

import java.util.List;


/**
 * 用户与角色对应关系
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2016年9月18日 上午9:43:24
 */
public interface SysUserRoleService {

    void saveOrUpdate(Long userId, List<Long> roleIdList);

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);

    void delete(Long userId);
}
