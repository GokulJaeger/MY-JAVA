package com.corejava.fruit_shop;

import java.util.ArrayList;

public class GroceryMain {
	public static void main(String[] args) {

		ArrayList<Grocery> fd = new ArrayList<>();

		initlist(fd);

		GroceryOperations go = new GroceryOperations();
		go.getDetails(fd);
		go.findByDis(fd, "Venki");
		go.sortDistGroceryType(fd);
		go.SortCostExpiry(fd);

	}

	static void initlist(ArrayList<Grocery> fd) {

		fd.add(new Grocery("Apple", "Fruits", "Venki", 40.00, "FruitandVeg", "Chennai", "12-12-2021", 2, 120));
		fd.add(new Grocery("Mango", "Fruits", "Sham", 80.00, "FruitandVeg", "Chennai", "02-11-2021", 4, 150));
		fd.add(new Grocery("Pomo", "Fruits", "Ashi", 60.00, "FruitandVeg", "Chennai", "05-10-2021", 3, 200));
	}
}
