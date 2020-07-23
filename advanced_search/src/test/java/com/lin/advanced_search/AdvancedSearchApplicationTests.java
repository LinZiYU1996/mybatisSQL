package com.lin.advanced_search;

import com.lin.advanced_search.entity.SysUser;
import com.lin.advanced_search.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class AdvancedSearchApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private SysUserMapper sysUserMapper;


    @Test
    public void t1() {

        SysUser sysUser = sysUserMapper.selectUserAndRoleById(1001L);
//SysUser{id=1001, userName=test, userPassword=123456, userEmail=test@mybatis.tk, userInfo=测试用户, createTime=2016-06-07T00:00}


        log.info(sysUser.toString());

    }



    @Test
    public void t2() {

        List<SysUser> sysUsers = sysUserMapper.selectAllUserAndRoles();

        log.info(sysUsers.toString());

    }
}
