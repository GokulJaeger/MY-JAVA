package com.corejava.fruit_shop;

public class Fruits extends Basemodel {
	private String fname;
	private String ftype;
	private String dis;
	private double fweight;
	private String fcategory;
	private String location;
	private String expDate;
	private int qty;
	private double cost;

	public Fruits(String fname, String ftype, String dis, double fweight, String fcategory, String location,
			String expDate, int qty, double cost) {
		this.fname = fname;
		this.ftype = ftype;
		this.dis = dis;
		this.fweight = fweight;
		this.fcategory = fcategory;
		this.location = location;
		this.expDate = expDate;
		this.qty = qty;
		this.cost = cost;
	}

	// public double costDetails(String fruitName) {
	// 	switch (fruitName) {
	// 		case "apple":
	// 			this.cost = 100;
	// 			this.tcost = this.qty * this.cost;
	// 			break;
	// 		case "kiwi":
	// 			cost = 100;
	// 			tcost = this.qty * this.cost;
	// 			break;
	// 		case "orange":
	// 			this.cost = 100;
	// 			this.tcost = this.qty * this.cost;
	// 			break;
	// 		case "muskmelon":
	// 			this.cost = 100;
	// 			this.tcost = this.qty * this.cost;
	// 			break;
	// 		case "custard apple":
	// 			this.cost = 100;
	// 			this.tcost = this.qty * this.cost;
	// 			break;
	// 		default:
	// 			System.out.println(" fruit not available");
	// 	}
	// 	return tcost;
	// }

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public String getDis() {
		return dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}

	public double getFweight() {
		return fweight;
	}

	public void setFweight(double fweight) {
		this.fweight = fweight;
	}

	public String getFcategory() {
		return fcategory;
	}

	public void setFcategory(String fcategory) {
		this.fcategory = fcategory;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Fruits [cost= " + cost + ", dis= " + dis + ", expDate= " + expDate + ", fcategory= " + fcategory
				+ ", fname= " + fname + ", ftype= " + ftype + ", fweight= " + fweight + ", location= " + location + ", qty= "
				+ qty + ", total cost= " + cost*qty + "]";
	}

	
}
