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


    /***
     * 查询课程名称为「数学」，且分数低于 60 的学生姓名和分数
     */
    @Test
    public void t8() {

        List<HashMap<String, String>> l1 = studentMapper.sel_1();

        log.info(l1.toString());
//[{sname=李云, cscore=30.0}]

    }

 //在 XML 中，一些字符拥有特殊的意义。
    //
    //如果您把字符 "<" 放在 XML 元素中，会发生错误，这是因为解析器会把它当作新元素的开始。
    //
    //这样会产生 XML 错误：
    //
    //为了避免这个错误，用实体引用来代替 "<" 字符，如下：
    //
    //  <message>if salary <1000 then</message> 需要改为<message>if salary &lt; 1000 then</message>
    //
    //在 XML 中，有 5 个预定义的实体引用：

    //&lt;	<	less than
    //&gt;	>	greater than
    //&amp;	&	ampersand
    //&apos;	'	apostrophe
    //&quot;	"	quotation mark


    /**
     * 查询平均成绩大于等于 60 分的同学的学生编号、学生姓名和平均成绩
     *
     *
     */
    @Test
    public void t9() {
        List<HashMap<String, String>> l1 = studentMapper.sel_2();

        log.info(l1.toString());
//[{sname=赵雷, sid=01, 平均分=89.66667},
// {sname=钱电, sid=02, 平均分=70.00000}
// , {sname=孙风, sid=03, 平均分=80.00000},
// {sname=周梅, sid=05, 平均分=81.50000},
// {sname=郑竹, sid=07, 平均分=93.50000}]



    }



}