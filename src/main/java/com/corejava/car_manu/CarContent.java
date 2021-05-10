package com.corejava.car_manu;

public class CarContent implements BaseModel {
    private String catg;
    private String sku;
    private String dom;
    private String isfragile;
    private String mono;
    private String colr;
    private Float costStep;

    public CarContent(String catg, String sku, String dom, String isfragile, String mono, String colr, Float costStep) {
        this.catg = catg;
        this.sku = sku;
        this.dom = dom;
        this.isfragile = isfragile;
        this.mono = mono;
        this.colr = colr;
        this.costStep = costStep;
    }

    public String getCatg() {
        return catg;
    }

    public void setCatg(String catg) {
        this.catg = catg;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getIsfragile() {
        return isfragile;
    }

    public void setIsfragile(String isfragile) {
        this.isfragile = isfragile;
    }

    public String getMono() {
        return mono;
    }

    public void setMono(String mono) {
        this.mono = mono;
    }

    public String getColr() {
        return colr;
    }

    public void setColr(String colr) {
        this.colr = colr;
    }

    public Float getCostStep() {
        return costStep;
    }

    public void setCostStep(Float costStep) {
        this.costStep = costStep;
    }

    @Override
    public String toString() {
        return "CarContent [catg=" + catg + ", colr=" + colr + ", costStep=" + costStep + ", dom=" + dom
                + ", isfragile=" + isfragile + ", mono=" + mono + ", sku=" + sku + "]";
    }
    
}
