package com.corejava.fruit_shop;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitShop {

	public static void main(String[] args) {

		ArrayList<Fruits> fd = new ArrayList<>();	
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no.of.Fruit details : ");
	int n=sc.nextInt();
	for (int i=0;i<n;i++) {
		
		System.out.println("enter the fruit name");
		
		String fruitName= sc.nextLine();
		System.out.println("enter the fruit Type");
		String fruitType= sc.nextLine();
		System.out.println("enter the fruit weight");
		double distributor= sc.nextDouble();
		System.out.println("enter the Distributor name");
		String fruitWeight= sc.nextLine();
		System.out.println("enter the fruit category");
		String fruitcategory= sc.nextLine();
		System.out.println("enter the location");
		String location= sc.nextLine();
		System.out.println("enter the expiryDate");
		String expiryDate= sc.next();
		System.out.println("enter the quantity");
		int quantity= sc.nextInt();
		System.out.println("enter the cost");
		double cost= sc.nextDouble();
		
		fd.add(new Fruits(fruitName, fruitType, fruitWeight, distributor, fruitcategory, location, expiryDate, quantity, cost,quantity*cost));
	}
	sc.close();
	
	FruitOperation fo=new FruitOperation();
	fo.getDetails(fd);
	fo.findByDis(fd,"Venki");
	fo.findByName(fd,"Apple");
	fo.findByloc(fd,"chennai");
	}

}
