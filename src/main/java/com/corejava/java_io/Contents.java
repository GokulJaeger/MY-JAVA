package com.corejava.java_io;

public class Contents implements BaseModel {
    private String id;
    private String catg;
    private long sku;
    private String dom;
    private char isf;
    protected String[] mc;
    private double cost;
    public Contents(String id, String catg, long sku, String dom, char isf, String[] mc, double cost) {
        this.id = id;
        this.catg = catg;
        this.sku = sku;
        this.dom = dom;
        this.isf = isf;
        this.mc = mc;
        this.cost = cost;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatg() {
        return catg;
    }

    public void setCatg(String catg) {
        this.catg = catg;
    }

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public char getIsf() {
        return isf;
    }

    public void setIsf(char isf) {
        this.isf = isf;
    }

    public String[] getMc() {
        return mc;
    }

    public void setMc(String[] mc) {
        this.mc = mc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Contents [catg=" + catg + ", cost=" + cost + ", dom=" + dom + ", id=" + id + ", isf=" + isf + ", mname="
                + mc[0]+", color="+ mc[1] + ", sku=" + sku + "]";
    }

       

}
