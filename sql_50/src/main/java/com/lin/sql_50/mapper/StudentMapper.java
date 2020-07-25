package com.lin.sql_50.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.sql_50.entity.Student;

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
public interface StudentMapper extends BaseMapper<Student> {




    List<HashMap<String, Integer>> countManAndWoManNumber();

    List<HashMap<Integer, Integer>> countCoursesByStudents();

}
