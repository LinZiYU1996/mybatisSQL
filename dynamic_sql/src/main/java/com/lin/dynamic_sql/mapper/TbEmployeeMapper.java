package com.lin.dynamic_sql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.dynamic_sql.entity.TbEmployee;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2020-07-26
 */
public interface TbEmployeeMapper extends BaseMapper<TbEmployee> {

    List<TbEmployee> selectEmployeeByIdLike(HashMap<String, Object> params);

//    List<TbEmployee> selectEmployeeByLoginLike(HashMap<String, Object> params);
//
//    List<TbEmployee> selectEmployeeChoose(HashMap<String, Object> params);
//
//    List<TbEmployee> findEmployeeLike(HashMap<String, Object> params);
//
//    List<TbEmployee> selectEmployeeLike(HashMap<String, Object> params);
//
    TbEmployee selectEmployeeWithId(Integer id);
//
//    void updateEmployeeIfNecessary(TbEmployee employee);
//
//    List<TbEmployee> selectEmployeeIn(List<Integer> ids);
//
//    List<TbEmployee> selectEmployeeLikeName(TbEmployee employee);





}
