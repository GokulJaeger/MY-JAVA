package com.corejava.clinic_logfile;

public class Records implements BaseClass {
    private String id;
    private String ref;
    protected double[] values;
    private int age;
    public Records(String id, String ref, double[] values, int age) {
        this.id = id;
        this.ref = ref;
        this.values = values;
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
    public double[] getValues() {
        return values;
    }
    public void setValues(double[] values) {
        this.values = values;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Records [age=" + age + ", id=" + id + ", ref=" + ref + ", lipid=" + values[0]+", lcd="+ values[1]+", pcs="+ values[2]+", opd="+ values[3]+ ", sgt="+ values[4]+ ", chl="+ values[5]+ "]";
    }

    
}
