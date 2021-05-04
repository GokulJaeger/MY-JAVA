package com.corejava.fruit_shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryMain {
	public static void main(String[] args) {

		ArrayList<Grocery> fd = new ArrayList<>();

		initlist(fd);
		getDetails(fd);
		findByDis(fd, "Venki");
		sortDistGroceryType(fd);
		SortCostExpiry(fd);

	}

	static void initlist(ArrayList<Grocery> fd) {

		fd.add(new Grocery("Apple", "Fruits", "Venki", 40.00, "FruitandVeg", "Chennai", "12-12-2021", 2, 120));
		fd.add(new Grocery("Mango", "Fruits", "Sham", 80.00, "FruitandVeg", "Chennai", "02-11-2021", 4, 150));
		fd.add(new Grocery("Pomo", "Fruits", "Ashi", 60.00, "FruitandVeg", "Chennai", "05-10-2021", 3, 200));
	}

	static void getDetails(List<Grocery> fd) {
		System.out.println("Grocery Deatils:\n");
		for (int i = 0; i < fd.size(); i++) {
			System.out.println(fd.get(i));
		}
		System.out.println("========================================================================================");
	}

	static void sortDistGroceryType(List<Grocery> fd) {
		Collections.sort(fd, new SortDistGrocType());
		System.out.println("Grocery Deatils:\n");
		for (int i = 0; i < fd.size(); i++) {
			System.out.println(fd.get(i));
		}
		System.out.println("========================================================================================");

	}

	static void SortCostExpiry(List<Grocery> fd) {
		Collections.sort(fd, new SortCostExpiry());
		System.out.println("Grocery Deatils:\n");
		for (int i = 0; i < fd.size(); i++) {
			System.out.println(fd.get(i));
		}
		System.out.println("========================================================================================");

	}

	static void findByDis(List<Grocery> fd, String distName) {
		System.out.println("Searched");
		System.out.println("Grocery Deatils:\n");
		for (Grocery g : fd) {
			if (g.distributor.equals(distName)) {
				System.out.println(g);
			}
		}
		System.out.println("========================================================================================");

	}
}
