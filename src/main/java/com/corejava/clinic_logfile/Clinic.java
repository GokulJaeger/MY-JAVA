package com.corejava.clinic_logfile;

import java.util.Date;

public class Clinic implements BaseClass {
    private Date date;
    private String region;
    private String ctype;
    private int norec;
    private String seq;
    public Clinic(Date date, String region, String ctype, int norec, String seq) {
        this.date = date;
        this.region = region;
        this.ctype = ctype;
        this.norec = norec;
        this.seq = seq;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getCtype() {
        return ctype;
    }
    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
    public int getNorec() {
        return norec;
    }
    public void setNorec(int norec) {
        this.norec = norec;
    }
    public String getSeq() {
        return seq;
    }
    public void setSeq(String seq) {
        this.seq = seq;
    }
    @Override
    public String toString() {
        return "[Clininc Type=" + ctype + ", Date=" + date + ", Number of Records=" + norec + ", Region=" + region + ", Sequence Number=" + seq
                + "]";
    }
}
