package com.mooc.entity;

import java.util.Date;

public class Course {
    private Integer cid;

    private String cname;

    private String cdesc;

    private Integer cplayvolume;

    private String cauthor;

    private Date cuploadtime;

    private Integer ctid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc == null ? null : cdesc.trim();
    }

    public Integer getCplayvolume() {
        return cplayvolume;
    }

    public void setCplayvolume(Integer cplayvolume) {
        this.cplayvolume = cplayvolume;
    }

    public String getCauthor() {
        return cauthor;
    }

    public void setCauthor(String cauthor) {
        this.cauthor = cauthor == null ? null : cauthor.trim();
    }

    public Date getCuploadtime() {
        return cuploadtime;
    }

    public void setCuploadtime(Date cuploadtime) {
        this.cuploadtime = cuploadtime;
    }

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }
}