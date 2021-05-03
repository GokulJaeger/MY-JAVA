package com.corejava.fruit_shop;

import java.util.ArrayList;
import java.util.List;

public class FruitShop {

	public static void main(String[] args) {

		ArrayList<Fruits> fd = new ArrayList<>();

		fd.add(new Fruits("Apple", "Season Fruit","Vinoth", 68,"Tropical", "Chennai", "21-10-2021", 20, 100));
		fd.add(new Fruits("Mango", "Season Fruit","Giri", 80,"Tropical", "Trichy", "15-10-2021", 30, 150));
		fd.add(new Fruits("Banana", "All Season Fruit","Yogi", 15,"Tropical", "Namakkal", "05-10-2021", 50, 70));
		fd.add(new Fruits("Kiwi Fruit", "Season Fruit","Ganesh", 10,"Tropical", "Osur", "20-08-2021", 40, 120));

		String disti = "Vinoth";
		getDetails(fd);
		findByDis(fd, disti);
		findByName(fd, "Banana");
		findByloc(fd, "Trichy");
	}

	static void getDetails(ArrayList<Fruits> al) {
		System.out.println("List Of Fruits");
		for (int i = 0; i < al.size(); i++) {
			Fruits af = al.get(i);
			System.out.println(i);
			System.out.println(af);
		}
	}

	static void findByDis(List<Fruits> al, String distName) {
		System.out.println("Distributor search Completed");
		for (int i = 0; i < al.size(); i++) {
			Fruits f = al.get(i);
			if (f.getDis().equalsIgnoreCase(distName)) {
				System.out.println(f);
			}
		}
	}

	static void findByName(List<Fruits> al, String name) {
		System.out.println("Fruit Search  Completed");
		for (int i = 0; i < al.size(); i++) {
			Fruits f1 = al.get(i);
			if (f1.getFname().equalsIgnoreCase(name)) {
				System.out.println(f1);
			}
		}
	}

	static void findByloc(List<Fruits> al, String location) {
		System.out.println("Search by Location Completed");
		for (int i = 0; i < al.size(); i++) {
			Fruits f2 = al.get(i);
			if (f2.getLocation().equalsIgnoreCase(location)) {
				System.out.println(f2);
			}
		}
	}

}
