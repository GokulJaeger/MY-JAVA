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
	double tcost;
	public Grocery(String groceryName, String groceryType, String distributor, double groceryWeight,
			String groceryCategory, String location, String expiryDate, int quantity, double cost, double totalcost) {
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
		this.tcost = totalcost;
	}
	public double costDetails(String GroceryName)
	{
	switch(GroceryName)
	{
	case "rice":cost=50;
	tcost=qty*cost;
	break;
	case "dhal":cost=180;
	tcost=qty*cost;
	break;
	case "oil":cost=160;
	tcost=qty*cost;
	break;
	case "snacks":cost=50;
	tcost=qty*cost;
	break;
	case "beverage":cost=75;
	tcost=qty*cost;
	break;
	default:System.out.println("Grocery not available");
	}
	return tcost;
	}
	@Override
	public String toString() {
		return "Grocerydetails [GroceryName=" + gname + ", GroceryType=" + gtype + ", Distributor="
				+ distributor + ", GroceryWeight=" + gweight + ", GroceryCategory=" + gcategory
				+ ", location=" + location + ", expiryDate=" + expDate + ", quantity=" + qty + ", cost=" + cost
				+ ", totalcost=" + tcost + "]";
	}
	
}

