package com.lin.many_to_many.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lin
 * @since 2020-07-23
 */

@Data
public class Orders extends Model<Orders> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String number;

    //和用户表构成一对一的关系，即一个订单只能由一个用户创建
    private User user;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
