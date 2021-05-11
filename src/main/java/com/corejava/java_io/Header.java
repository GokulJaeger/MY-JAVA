package com.corejava.java_io;

public class Header implements BaseModel {
    private String date;
    private String mname;
    private int nor;
    private String seq;
    private double tcost;
    public Header(String date, String mname, int nor, String seq, double tcost) {
        this.date = date;
        this.mname = mname;
        this.nor = nor;
        this.seq = seq;
        this.tcost = tcost;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public int getNor() {
        return nor;
    }
    public void setNor(int nor) {
        this.nor = nor;
    }
    public String getSeq() {
        return seq;
    }
    public void setSeq(String seq) {
        this.seq = seq;
    }
    public double getTcost() {
        return tcost;
    }
    public void setTcost(double tcost) {
        this.tcost = tcost;
    }
    @Override
    public String toString() {
        return "Header [date=" + date + ", mname=" + mname + ", nor=" + nor + ", seq=" + seq + ", tcost=" + tcost + "]";
    }

    
}
