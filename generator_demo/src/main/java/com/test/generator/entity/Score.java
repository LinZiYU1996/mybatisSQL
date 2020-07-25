package com.test.generator.entity;

import java.math.BigDecimal;
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
public class Score extends Model<Score> {

    private static final long serialVersionUID=1L;

    private String sid;

    private String cid;

    private BigDecimal cscore;


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public BigDecimal getCscore() {
        return cscore;
    }

    public void setCscore(BigDecimal cscore) {
        this.cscore = cscore;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Score{" +
        "sid=" + sid +
        ", cid=" + cid +
        ", cscore=" + cscore +
        "}";
    }
}
