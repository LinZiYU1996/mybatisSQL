package com.lin.dynamic_sql;

import com.lin.dynamic_sql.entity.TbEmployee;
import com.lin.dynamic_sql.mapper.TbEmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/7/26
 * \* Time: 10:12
 * \* Description:
 * \
 */

@SpringBootTest
@Slf4j
public class T1 {

    @Autowired
    private TbEmployeeMapper tbEmployeeMapper;

    @Test
    public void t1() {

        TbEmployee employee = tbEmployeeMapper.selectEmployeeWithId(1);

        log.info(employee.toString());
//TbEmployee(id=1, loginname=jack, password=123456, name=杰克, sex=男, age=26, phone=13902019999, sal=9800.0, state=ACTIVE)
    }



    @Test
    public void t2() {

        HashMap<String, Object> params = new HashMap<String, Object>();

        params.put("id", 1);
        // 调用EmployeeMapper接口的selectEmployeeByIdLike方法

        List<TbEmployee> list = tbEmployeeMapper.selectEmployeeByIdLike(params);
        log.info(list.toString());

// [TbEmployee(id=1, loginname=jack, password=123456, name=杰克, sex=男, age=26, phone=13902019999, sal=9800.0, state=ACTIVE)]




    }

    @Test
    public void t3() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        // 设置id属性
        params.put("id", 1);
        params.put("loginname", "jack");
        params.put("password", "123456");
        List<TbEmployee> list = tbEmployeeMapper.selectEmployeeChoose(params);
        log.info(list.toString());
//[TbEmployee(id=1, loginname=jack, password=123456, name=杰克, sex=男, age=26, phone=13902019999, sal=9800.0, state=ACTIVE)]
    }

    @Test
    public void t4() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        List<TbEmployee> list = tbEmployeeMapper.selectEmployeeChoose(params);
        log.info(list.toString());

//[TbEmployee(id=1, loginname=jack, password=123456, name=杰克, sex=男, age=26, phone=13902019999, sal=9800.0, state=ACTIVE)]
    }

    @Test
    public void testUpdateEmployeeIfNecessary() {

        TbEmployee employee = tbEmployeeMapper.selectEmployeeWithId(1);
        // 设置需要修改的属性
        employee.setLoginname("mary");
        employee.setPassword("123");
        employee.setName("玛丽");
        tbEmployeeMapper.updateEmployeeIfNecessary(employee);

    }

    @Test
    public void testSelectEmployeeIn() {

        List<Integer> ids = new ArrayList<Integer>();
        // 往List集合中添加两个测试数据
        ids.add(1);
        ids.add(2);
        List<TbEmployee> list = tbEmployeeMapper.selectEmployeeIn(ids);
        log.info(list.toString());
// [TbEmployee(id=1, loginname=mary, password=123, name=玛丽, sex=男, age=26, phone=13902019999, sal=9800.0, state=ACTIVE),
// TbEmployee(id=2, loginname=rose, password=123456, name=露丝, sex=女, age=21, phone=13902018888, sal=6800.0, state=ACTIVE)]

    }
    @Test
    public void testSelectEmployeeLikeName() {

        TbEmployee employee = new TbEmployee();
        // 设置模糊查询的参数
        employee.setName("o");
        List<TbEmployee> list = tbEmployeeMapper.selectEmployeeLikeName(employee);
        log.info(list.toString());
//[TbEmployee(id=2, loginname=rose, password=123456, name=露丝, sex=女, age=21, phone=13902018888, sal=6800.0, state=ACTIVE)]


    }
}
