package com.lin.annotation_demo;

import com.lin.annotation_demo.entity.SysRole;
import com.lin.annotation_demo.mapper.SysRoleMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/7/20
 * \* Time: 10:00
 * \* Description:
 * \
 */

@SpringBootTest
@Slf4j
public class Test {

    @Autowired
    private SysRoleMapper sysRoleMapper;


    /**
     * 测试 @select 注解
     */
    @org.junit.jupiter.api.Test
    public void t1() {

        SysRole sysRole = sysRoleMapper.selectById(1L);

        log.info(sysRole.toString());

        // SysRole{id=1, roleName=管理员, enabled=1, createBy=1, createTime=2016-04-01T17:02:14}


    }

    /**
     * 测试    @Results注解
     */
    @org.junit.jupiter.api.Test
    public void t2() {
        SysRole sysRole = sysRoleMapper.selectById2(1L);
        log.info(sysRole.toString());


// SysRole{id=1, roleName=管理员, enabled=1, createBy=1, createTime=2016-04-01T17:02:14}
    }

    @org.junit.jupiter.api.Test
    public void t3() {

        List<SysRole> roles = sysRoleMapper.selectAll();

        for (SysRole r : roles) {
            log.info(r.toString());
        }
        //2020-07-20 10:11:18.306  INFO 16112 --- [           main] com.lin.annotation_demo.Test             :
        // SysRole{id=1, roleName=管理员, enabled=1, createBy=1, createTime=2016-04-01T17:02:14}
        //2020-07-20 10:11:18.306  INFO 16112 --- [           main] com.lin.annotation_demo.Test             :
        // SysRole{id=2, roleName=普通用户, enabled=1, createBy=1, createTime=2016-04-01T17:02:34}


    }




}
