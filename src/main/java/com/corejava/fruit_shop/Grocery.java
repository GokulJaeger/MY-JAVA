package com.corejava.fruit_shop;

public class Grocery extends Basemodel  {
	String gname;
	String gtype;
	String distributor;
	double gweight;
	String gcategory;
	String location;
	String expDate;
	int qty;
	double cost;
	public Grocery(String groceryName, String groceryType, String distributor, double groceryWeight,
			String groceryCategory, String location, String expiryDate, int quantity, double cost) {
		super();
		this.gname = groceryName;
		this.gtype = groceryType;
		this.distributor = distributor;
		this.gweight = groceryWeight;
		this.gcategory = groceryCategory;
		this.location = location;
		this.expDate = expiryDate;
		this.qty = quantity;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "[GName=" + gname + ", GType=" + gtype + ", Distributor="
				+ distributor + ", GWeight=" + gweight + ", GCategory=" + gcategory
				+ ", Location=" + location + ", ExpiryDate=" + expDate + ", Quantity=" + qty + ", Cost=" + cost
				+ ", Total cost= " + cost*qty +  "]";
	}
	
}

