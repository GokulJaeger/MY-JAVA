package com.corejava.car_manu;

import java.util.Date;

public class CarContent implements BaseModel {
    public String Catg ;	
	public String SKU ;
	public Date Dom;
	public String ISFragile ;	
	public String Mono;
	public String Colr;
	public Float CostStep;
    public CarContent(String catg, String sKU, Date dom, String iSFragile, String mono, String colr, Float costStep) {
        super();
        Catg = catg;
        SKU = sKU;
        Dom = dom;
        ISFragile = iSFragile;
        Mono = mono;
        Colr = colr;
        CostStep = costStep;
    }
    public String getCatg() {
        return Catg;
    }
    public void setCatg(String catg) {
        Catg = catg;
    }
    public String getSKU() {
        return SKU;
    }
    public void setSKU(String sKU) {
        SKU = sKU;
    }
    public Date getDom() {
        return Dom;
    }
    public void setDom(Date dom) {
        Dom = dom;
    }
    public String getISFragile() {
        return ISFragile;
    }
    public void setISFragile(String iSFragile) {
        ISFragile = iSFragile;
    }
    public String getMono() {
        return Mono;
    }
    public void setMono(String mono) {
        Mono = mono;
    }
    public String getColr() {
        return Colr;
    }
    public void setColr(String colr) {
        Colr = colr;
    }
    public Float getCostStep() {
        return CostStep;
    }
    public void setCostStep(Float costStep) {
        CostStep = costStep;
    }
    @Override
    public String toString() {
        return "CarContent [Catg=" + Catg + ", Colr=" + Colr + ", CostStep=" + CostStep + ", Dom=" + Dom
                + ", ISFragile=" + ISFragile + ", Mono=" + Mono + ", SKU=" + SKU + "]";
    }

    
}
