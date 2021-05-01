package com.corejava.fruit_shop;

public class Fruits extends Basemodel {
	String fname;
	String ftype;
	String dis;
	double fweight;
	String fcategory;
	String location;
	String expDate;
	int qty;
	double cost;
	double tcost;

	public Fruits(String fruitName, String fruitType, String distributor, double fruitWeight, String fruitCategory,
			String location, String expiryDate, int quantity, double cost, double totalcost) {
		this.fname = fruitName;
		this.ftype = fruitType;
		this.dis = distributor;
		this.fweight = fruitWeight;
		this.fcategory = fruitCategory;
		this.location = location;
		this.expDate = expiryDate;
		this.qty = quantity;
		this.cost = cost;
		this.tcost = totalcost;
	}

	public double costDetails(String fruitName) {
		switch (fruitName) {
			case "apple":
				this.cost = 100;
				this.tcost = this.qty * this.cost;
				break;
			case "kiwi":
				cost = 100;
				tcost = this.qty * this.cost;
				break;
			case "orange":
				this.cost = 100;
				this.tcost = this.qty * this.cost;
				break;
			case "muskmelon":
				this.cost = 100;
				this.tcost = this.qty * this.cost;
				break;
			case "custard apple":
				this.cost = 100;
				this.tcost = this.qty * this.cost;
				break;
			default:
				System.out.println(" fruit not available");
		}
		return tcost;
	}

	@Override
	public String toString() {
		return "Fruitdetails [fruitName=" + fname + ", fruitType=" + ftype + ", Distributor=" + dis + ", fruitWeight="
				+ fweight + ", fruitCategory=" + fcategory + ", location=" + location + ", expiryDate=" + expDate
				+ ", quantity=" + qty + ", cost=" + cost + ", totalcost=" + tcost + "]";
	}

}
