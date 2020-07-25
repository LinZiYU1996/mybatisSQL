package com.lin.many_to_many.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.many_to_many.entity.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lin
 * @since 2020-07-23
 */
public interface UserMapper extends BaseMapper<User> {

    //根据用户id查询用户信息，以及用户下面的所有订单信息
    public User selectUserAndOrdersByUserId(int UserId);

    //给定一个角色id，要得到具有这个角色的所有用户信息
    public List<User> getUserByRoleId(int roleId);


}
