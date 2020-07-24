package com.lin.many_to_many.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lin
 * @since 2020-07-23
 */
@Data
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String sex;


    //一个用户能创建多个订单，用户和订单构成一对多的关系
    public List<Orders> orders;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
