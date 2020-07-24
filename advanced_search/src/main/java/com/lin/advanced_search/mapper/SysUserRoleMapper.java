package com.lin.advanced_search.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.advanced_search.entity.SysRole;
import com.lin.advanced_search.entity.SysUserRole;

import java.util.List;

/**
 * <p>
 * 用户角色关联表 Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2020-07-23
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    List<SysRole> getRoles(Long id);



}
