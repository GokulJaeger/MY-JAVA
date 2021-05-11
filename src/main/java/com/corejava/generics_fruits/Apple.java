package com.corejava.generics_fruits;

public class Apple {
	// private String fruitName; =0
	// private String fruitType; =1
	// private String distributorName; =2
	// private String fruitCategory; =3
	// private String location; =4
	// private String expiryDate; =5
	String[] values;
	private double fruitWeight;
	private int quantity;
	private double cost;
	private double totalcost;

	
	public String[] getValues() {
		return values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	public double getFruitWeight() {
		return fruitWeight;
	}
	public void setFruitWeight(double fruitWeight) {
		this.fruitWeight = fruitWeight;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}
	@Override
	public String toString() {
		return "Apple [fruitName=" + values[0] + ", fruitType=" + values[1] + ", distributorName=" + values[2]
				+ ", fruitWeight=" + fruitWeight + ", fruitCategory=" + values[3] + ", location=" + values[4]
				+ ", expiryDate=" + values[5] + ", quantity=" + quantity + ", cost=" + cost + ", totalcost="
				+ totalcost + "]";
	}
	public Apple(String[] values, double fruitWeight, int quantity, double cost, double totalcost) {
		super();
		this.fruitWeight = fruitWeight;
		this.quantity = quantity;
		this.cost = cost;
		this.values = values;
		this.totalcost = totalcost;
	}
	
}

