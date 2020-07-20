package com.lin.annotation_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.annotation_demo.entity.SysRole;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2020-07-20
 */
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {


    @Select({"select id,role_name roleName, enabled, create_by createBy, create_time createTime",
            "from sys_role",
            "where id = #{id}"})
    SysRole selectById(Long id);


    @Results(id = "roleResultMap", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "roleName", column = "role_name"),
            @Result(property = "enabled", column = "enabled"),
            @Result(property = "createBy", column = "create_by"),
            @Result(property = "createTime", column = "create_time")
    })
    @Select("select id,role_name, enabled, create_by, create_time from sys_role where id = #{id}")
    SysRole selectById2(Long id);

    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole> selectAll();


    /**
     * 不需要返回主键
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(id, role_name, enabled, create_by, create_time)",
            "values(#{id}, #{roleName}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
    int insert(SysRole sysRole);


    /**
     *  返回自增主键
     *  与上面的比较
     *  2 中 sql少了 id一列
     *  多了Options
     *  设置了 useGeneratedKeys = true, keyProperty = "id"
     * @param sysRole
     * @return
     */
    @Insert({"insert into sys_role(role_name, enabled, create_by, create_time)",
            "values(#{roleName}, #{enabled}, #{createBy}, #{createTime, jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert2(SysRole sysRole);


    @Update({"update sys_role",
            "set role_name = #{roleName},",
            "enabled = #{enabled},",
            "create_by = #{createBy},",
            "create_time = #{createTime, jdbcType=TIMESTAMP}",
            "where id = #{id}"
    })
    int updateById(SysRole sysRole);

    @Delete("delete from sys_role where id = #{id}")
    int deleteById(Long id);



}
