package com.lin.sql_50;

import com.lin.sql_50.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
@Slf4j
class Sql50ApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private StudentMapper studentMapper;


    @Test
    public void t1() {

        List<HashMap<String, Integer>> hashMap = studentMapper.countManAndWoManNumber();
        log.info(hashMap.toString());
//[{性别=女, 人数=4}, {性别=男, 人数=4}]

    }



    @Test
    public void t2() {

        List<HashMap<Integer, Integer>> hashMaps = studentMapper.countCoursesByStudents();

        log.info(hashMaps.toString());
        //[{选修人数=6, cid=01}, {选修人数=6, cid=02}, {选修人数=6, cid=03}]


    }





}
