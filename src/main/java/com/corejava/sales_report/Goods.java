package com.corejava.sales_report;

public class Goods extends BaseModel{
    
    public Goods(String id, String name, String category, String description, int count, float price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.count = count;
        this.price = price;
    }
    private String id;
    private String name;
    private String category;
    private String description;
    private int count;
    private float price;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Goods [Description=" + description + ", category=" + category + ", count=" + count + ", id=" + id
                + ", name=" + name + ", price=" + price + "]";
    }
    
}
