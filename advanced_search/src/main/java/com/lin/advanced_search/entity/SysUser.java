package com.lin.advanced_search.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Lin
 * @since 2020-07-21
 */

@Data
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID=1L;

    /**
     * 用户ID
     */
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 简介
     */
    private String userInfo;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    private SysRole sysRole;

    private List<SysRole> roleList;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "id=" + id +
        ", userName=" + userName +
        ", userPassword=" + userPassword +
        ", userEmail=" + userEmail +
        ", userInfo=" + userInfo +
        ", createTime=" + createTime+
        sysRole.toString()
                +
        "}";
    }
}
