package com.lin.many_to_many.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.many_to_many.entity.User;

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
}
