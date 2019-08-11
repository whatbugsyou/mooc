package com.mooc.entity;

public class Video {
    private Integer vid;

    private String vname;

    private String vepisode;

    private String vaddress;
    
    private Integer cid;

    

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getVepisode() {
        return vepisode;
    }

    public void setVepisode(String vepisode) {
        this.vepisode = vepisode == null ? null : vepisode.trim();
    }

    public String getVaddress() {
        return vaddress;
    }

    public void setVaddress(String vaddress) {
        this.vaddress = vaddress == null ? null : vaddress.trim();
    }
}