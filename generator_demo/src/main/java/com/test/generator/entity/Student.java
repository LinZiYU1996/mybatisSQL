package com.test.generator.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lin
 * @since 2020-07-24
 */
public class Student extends Model<Student> {

    private static final long serialVersionUID=1L;

    @TableField("Sid")
    private String Sid;

    @TableField("Sname")
    private String Sname;

    @TableField("Sage")
    private LocalDateTime Sage;

    @TableField("Ssex")
    private String Ssex;


    public String getSid() {
        return Sid;
    }

    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public LocalDateTime getSage() {
        return Sage;
    }

    public void setSage(LocalDateTime Sage) {
        this.Sage = Sage;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String Ssex) {
        this.Ssex = Ssex;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
        "Sid=" + Sid +
        ", Sname=" + Sname +
        ", Sage=" + Sage +
        ", Ssex=" + Ssex +
        "}";
    }
}
