package com.corejava.car_manu;


public class CarHeader implements BaseModel {
    private String date ;
	private String mName;	
	private int nor;	
	private String fiSeq;	
	private int 	tot;
    public CarHeader(String date, String mName, int nor, String fiSeq, int tot) {
        this.date = date;
        this.mName = mName;
        this.nor = nor;
        this.fiSeq = fiSeq;
        this.tot = tot;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public int getNor() {
        return nor;
    }
    public void setNor(int nor) {
        this.nor = nor;
    }
    public String getFiSeq() {
        return fiSeq;
    }
    public void setFiSeq(String fiSeq) {
        this.fiSeq = fiSeq;
    }
    public int getTot() {
        return tot;
    }
    public void setTot(int tot) {
        this.tot = tot;
    }
    @Override
    public String toString() {
        return "CarHeader [date=" + date + ", fiSeq=" + fiSeq + ", mName=" + mName + ", nor=" + nor + ", tot=" + tot
                + "]";
    }

    
}
