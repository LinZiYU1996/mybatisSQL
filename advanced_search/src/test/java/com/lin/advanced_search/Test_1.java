package com.lin.advanced_search;

import com.lin.advanced_search.entity.SysRole;
import com.lin.advanced_search.entity.SysUserRole;
import com.lin.advanced_search.mapper.SysUserMapper;
import com.lin.advanced_search.mapper.SysUserRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/7/23
 * \* Time: 9:18
 * \* Description:
 * \
 */

@Slf4j
@SpringBootTest
public class Test_1 {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserRoleMapper userRoleMapper;



    @Test
    public void t1() {

        List<SysRole> roles = sysUserMapper.getRoles(1001L);
        log.info(roles.toString());

//[SysRole{id=null, roleName=普通用户, enabled=null, createBy=null, createTime=null}]
//[SysRole{id=2, roleName=普通用户, enabled=1, createBy=1, createTime=2016-04-01T17:02:34}]
    }

    @Test
    public void t2() {

        List<SysRole> roles = userRoleMapper.getRoles(1001L);


    }
}
