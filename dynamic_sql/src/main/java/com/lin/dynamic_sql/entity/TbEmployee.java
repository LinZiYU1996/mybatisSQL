package com.lin.dynamic_sql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2020-07-26
 */

@Data
public class TbEmployee extends Model<TbEmployee> {

    private static final long serialVersionUID=1L;

      @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private String loginname;

    @TableField("PASSWORD")
    private String password;

    @TableField("NAME")
    private String name;

    @TableField("SEX")
    private String sex;

    @TableField("AGE")
    private Integer age;

    private String phone;

    private Double sal;

    private String state;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }


}
