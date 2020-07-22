package com.lin.dynamic_sql;

import com.lin.dynamic_sql.entity.SysUser;
import com.lin.dynamic_sql.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class DynamicSqlApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private SysUserMapper mapper;


    @Test
    public void t1() {

        SysUser sysUser = new SysUser();

        sysUser.setUserName("admin");


        List<SysUser> sysUsers = mapper.selectByUser(sysUser);

        for (SysUser user : sysUsers) {
            log.info(user.toString());
        }

//SysUser{id=1, userName=null, userPassword=null, userEmail=null, userInfo=null, createTime=null}
//SysUser{id=1, userName=admin, userPassword=123456, userEmail=admin@mybatis.tk, userInfo=管理员用户, createTime=2016-06-07T01:11:12}



    }

    @Test
    public void t2() {

        SysUser sysUser = new SysUser();

        sysUser.setId(1L);

        sysUser.setUserName("admin_1");

        mapper.updateByIdSelective(sysUser);




    }

    @Test
    public void t3() {

        SysUser sysUser = new SysUser();
        sysUser.setUserName("abc");

        mapper.insert3(sysUser);



    }
    @Test
    public void t4() {

        SysUser sysUser = new SysUser();

        sysUser.setId(1L);

        SysUser sysUser1 = mapper.selectByIdOrUserName(sysUser);

        log.info(sysUser1.toString());


    }

}
