package com.lin.dynamic_sql;

import com.lin.dynamic_sql.entity.TbEmployee;
import com.lin.dynamic_sql.mapper.TbEmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}
