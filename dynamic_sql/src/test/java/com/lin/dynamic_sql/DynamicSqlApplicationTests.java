package com.lin.dynamic_sql;

import com.lin.dynamic_sql.entity.SysUser;
import com.lin.dynamic_sql.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void t5() {

        List<Long> longs = new ArrayList<>();

        longs.add(1L);

        longs.add(1001L);

        longs.add(1002L);

        List<SysUser> sysUsers = mapper.selectByIdList(longs);

        log.info(sysUsers.toString());

// [SysUser{id=1, userName=admin_1, userPassword=123456, userEmail=admin@mybatis.tk, userInfo=管理员用户, createTime=2016-06-07T01:11:12},
// SysUser{id=1001, userName=test, userPassword=123456, userEmail=test@mybatis.tk, userInfo=测试用户, createTime=2016-06-07T00:00},
// SysUser{id=1002, userName=abc, userPassword=null, userEmail=test@mybatis.tk, userInfo=null, createTime=null}]


    }


    @Test
    public void t6() {

        List<SysUser> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            SysUser u = new SysUser();

            u.setUserName("a" + i);

            users.add(u);
        }

        int res = mapper.insertList(users);

        System.out.println(res);


    }


    @Test
    public void t7() {

        Map<String, Object> map = new HashMap<>();

        map.put("id", 1L);

        map.put("user_password", "56658996");

        mapper.updateByMap(map);




    }
}
