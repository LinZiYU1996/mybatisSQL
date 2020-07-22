package com.lin.dynamic_sql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.dynamic_sql.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2020-07-21
 */

@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     *
     * if 用法
     *
     * 实现一个用户高级查询功能
     *
     * 1 只输入用户名字 根据用户名 区模糊查询
     *
     * 2 只 输入邮箱 根据邮箱进行完全匹配
     *
     * 3 同时有 用户名 和邮箱 根据两个条件进行匹配
     *
     */


    List<SysUser> selectByUser(SysUser sysUser);

    /**
     *  需求
     *  只更新有变化的字段
     *
     */

    int updateByIdSelective(SysUser sysUser);


    /**
     *
     * 数据库表中插入数据
     * 如果某一列的参数值不是空
     * 就使用传入的值
     * 如果传入的参数为空
     * 就使用数据库中的默认值
     * 而不是使用传入的值
     *
     */

    void insert3(SysUser sysUser);


    /**
     * 当参数 id 有值的时候就优先使用id查询
     * 当id没有值的时候就去判断用户名是否有值
     * 如果有值的话就使用用户名查询
     * 如果用户名也没有值
     * 就使得sql查询无果
     *
     * @param sysUser
     * @return
     */
    SysUser selectByIdOrUserName(SysUser sysUser);
}
