package com.test.generator.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lin
 * @since 2020-07-24
 */
public class Teacher extends Model<Teacher> {

    private static final long serialVersionUID=1L;

    private String tid;

    private String tname;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Teacher{" +
        "tid=" + tid +
        ", tname=" + tname +
        "}";
    }
}
