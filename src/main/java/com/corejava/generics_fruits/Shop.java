package com.corejava.generics_fruits;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		String fruitName = "";
		String fruitType = "";
		String distributorName = "";
		double fruitWeight = 0;
		String fruitCategory = "";
		String location = "";
		String expiryDate = "";
		int quantity = 0;
		double cost = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Fruits Details to Add : ");
		int num = sc.nextInt();
		HashMap<Integer, Envy> h1 = new HashMap<>();
		HashMap<Integer, Fuji> h2 = new HashMap<>();
		HashMap<Integer, Cameo> h3 = new HashMap<>();
		for (int i = 1; i <= num; i++) {
			sc.nextLine();
			System.out.println("Enter the Fruit Name : ");
			fruitName = sc.nextLine();
			System.out.println("Enter the Fruit Type : ");
			fruitType = sc.nextLine();
			System.out.println("Enter the Distributor Name : ");
			distributorName = sc.nextLine();
			System.out.println("Enter the Fruit Weight : ");
			fruitWeight = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the Fruit Category : ");
			fruitCategory = sc.nextLine();
			System.out.println("Enter the Location : ");
			location = sc.nextLine();
			System.out.println("Enter the Expiry Date : ");
			expiryDate = sc.nextLine();
			System.out.println("Enter the Quantity : ");
			quantity = sc.nextInt();
			System.out.println("Enter the Cost : ");
			cost = sc.nextDouble();
			
			switch (i) {
				case 1:
				String[] vls = {fruitName, fruitType, distributorName,fruitCategory, location, expiryDate};
					h1.put(1, new Envy(vls, fruitWeight,  quantity, cost, cost * quantity));
					break;
				case 2:
				String[] vls1 = {fruitName, fruitType, distributorName,fruitCategory, location, expiryDate};
					h2.put(2, new Fuji(vls1, fruitWeight, quantity, cost, cost * quantity));
					break;
				default:
				String[] vls2 = {fruitName, fruitType, distributorName,fruitCategory, location, expiryDate};
					h3.put(3, new Cameo(vls2, fruitWeight, quantity, cost, cost * quantity));
					break;
			}
			new AppleCategory().getdetails(h1);
			new AppleCategory().getdetails(h2);
			new AppleCategory().getdetails(h3);

		}
		sc.close();
	}
}
