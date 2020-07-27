package com.lin.sql_50.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.sql_50.entity.Score;
import com.lin.sql_50.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2020-07-24
 */

@Repository
public interface StudentMapper extends BaseMapper<Student> {


    /**
     * 查询男生、女生人数
     * @return
     */
    List<HashMap<String, Integer>> countManAndWoManNumber();


    /**
     * 查询每门课程被选修的学生数
     * @return
     */
    List<HashMap<Integer, Integer>> countCoursesByStudents();

    /**
     *统计每门课程的学生选修人数（超过 num人的课程才统计
     */
    List<HashMap<Integer, Integer>> countStudentsMaxtoNum(Integer num);

    /**
     * 检索至少选修 num 门 课程的学生学号
     * @param num
     * @return
     */
    List<HashMap<Integer, Integer>> countCoursesMaxtoNum(Integer num);


    /**
     * 查询平均成绩大于等于 score 的所有学生的学号、姓名和平均成绩
     * @param score
     * @return
     */
    List<HashMap<Integer, Student>> averageScore(Integer score);

    /**
     * 查询不及格的课程及学生名，学号，按课程号从大到小排列】
     * @param score
     * @return
     */
//    List<HashMap<Student, Score>> getInfoStudentUnder60(Integer score);


    /**
     * 查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩（没成绩的显示为 null）
     * @return
     */
    List<HashMap<String, String>> getAll();


    List<HashMap<String, String>> sel_1();

    List<HashMap<String, String>> sel_2();



}
