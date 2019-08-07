package com.mooc.entity;

import java.util.Date;

public class Comment {
    private Integer cmid;

    private String cmdesc;

    private Integer cmgrade;

    private Date cmdate;

    private Integer uid;

    private Integer cid;

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public String getCmdesc() {
        return cmdesc;
    }

    public void setCmdesc(String cmdesc) {
        this.cmdesc = cmdesc == null ? null : cmdesc.trim();
    }

    public Integer getCmgrade() {
        return cmgrade;
    }

    public void setCmgrade(Integer cmgrade) {
        this.cmgrade = cmgrade;
    }

    public Date getCmdate() {
        return cmdate;
    }

    public void setCmdate(Date cmdate) {
        this.cmdate = cmdate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}