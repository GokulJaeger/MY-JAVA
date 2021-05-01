package com.corejava.fruit_shop;

import java.util.ArrayList;

public class GroceryMain  {
	public static void main(String[] args) {

		ArrayList<Grocery> fd = new ArrayList<>();	

		fd.add(new Grocery("Apple", "Fruits","Venki",12.00,"FruitandVeg", "Chennai", "12-12-2021", 2, 120, 240));


		GroceryOperations go=new GroceryOperations();
		go.getDetails(fd);
		go.findByDis(fd,"kishor");
		go.sortDistGroceryType(fd);
		go.SortCostExpiry(fd);
		
		
	}
	}

