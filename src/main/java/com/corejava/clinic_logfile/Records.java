package com.corejava.clinic_logfile;

public class Records implements BaseClass {
    private String id;
    private String ref;
    private double lipid;
    private double lcd;
    private double pcs;
    private double opd;
    private double sgt;
    private double chl;
    private int age;

    public Records(String id, String ref, double lipid, double lcd, double pcs, double opd, double sgt, double chl,
            int age) {
        this.id = id;
        this.ref = ref;
        this.lipid = lipid;
        this.lcd = lcd;
        this.pcs = pcs;
        this.opd = opd;
        this.sgt = sgt;
        this.chl = chl;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getLipid() {
        return lipid;
    }

    public void setLipid(double lipid) {
        this.lipid = lipid;
    }

    public double getLcd() {
        return lcd;
    }

    public void setLcd(double lcd) {
        this.lcd = lcd;
    }

    public double getPcs() {
        return pcs;
    }

    public void setPcs(double pcs) {
        this.pcs = pcs;
    }

    public double getOpd() {
        return opd;
    }

    public void setOpd(double opd) {
        this.opd = opd;
    }

    public double getSgt() {
        return sgt;
    }

    public void setSgt(double sgt) {
        this.sgt = sgt;
    }

    public double getChl() {
        return chl;
    }

    public void setChl(double chl) {
        this.chl = chl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[Age=" + age + ", CHL=" + chl + ", ID=" + id + ", LCD=" + lcd + ", Lipid=" + lipid + ", OPD="
                + opd + ", PCS=" + pcs + ", REF=" + ref + ", SGT=" + sgt + "]";
    }
}
