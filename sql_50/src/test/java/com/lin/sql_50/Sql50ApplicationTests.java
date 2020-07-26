package com.lin.sql_50;

import com.lin.sql_50.entity.Score;
import com.lin.sql_50.entity.Student;
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


    @Test
    public void t3() {

        List<HashMap<Integer, Integer>> hashMaps = studentMapper.countStudentsMaxtoNum(5);
        log.info(hashMaps.toString());
//[{选修人数=6, cid=01}, {选修人数=6, cid=02}, {选修人数=6, cid=03}]


    }


    @Test
    public void t4() {

        List<HashMap<Integer, Integer>> hashMaps = studentMapper.countCoursesMaxtoNum(3);
        log.info(hashMaps.toString());


//[{sid=01}, {sid=02}, {sid=03}, {sid=04}]


    }

    @Test
    public void t5() {


        List<HashMap<Integer, Student>> averageScores = studentMapper.averageScore(85);
        log.info(averageScores.toString());

        //[{avg(cscore)=89.66667, sname=赵雷, sid=01}, {avg(cscore)=93.50000, sname=郑竹, sid=07}]


    }

//
//    @Test
//    public void t6() {
//
//        List<HashMap<Student, Score>> getInfoStudentUnder60 = studentMapper.getInfoStudentUnder60(60);
//    }


    @Test
    public void t7() {

        List<HashMap<String, String>> all = studentMapper.getAll();

        log.info(all.toString());

//        [{总成绩=269.0, 选课数=3, sname=赵雷, sid=01},
//        {总成绩=210.0, 选课数=3, sname=钱电, sid=02},
//        {总成绩=240.0, 选课数=3, sname=孙风, sid=03},
//        {总成绩=100.0, 选课数=3, sname=李云, sid=04}
//        , {总成绩=163.0, 选课数=2, sname=周梅, sid=05},
//        {总成绩=65.0, 选课数=2, sname=吴兰, sid=06},
//        {总成绩=187.0, 选课数=2, sname=郑竹, sid=07},
//        {选课数=0, sname=王菊, sid=08}]


    }


}