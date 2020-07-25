package com.lin.many_to_many.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lin
 * @since 2020-07-24
 */

@Data
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID=1L;

    private Integer userId;

    private Integer roleId;




    @Override
    protected Serializable pkVal() {
        return null;
    }


}
