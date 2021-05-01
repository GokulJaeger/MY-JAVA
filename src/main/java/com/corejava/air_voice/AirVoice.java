package com.corejava.air_voice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirVoice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> clist = new ArrayList<Customer>();
		clist.add(new Customer(1, "c1", "South Africa", "No.203", "9710526061", "10%", "yes", 1400, "Prepaid", "yes",
				true));
		clist.add(new Customer(2, "c2", "South Africa", "No.203", "9952017621", "10%", "yes", 1300, "Postpaid", "yes",
				true));
		clist.add(
				new Customer(3, "c3", "Tanzania", "No.203", "6152017623", "10%", "yes", 1200, "Postpaid", "no", false));
		clist.add(
				new Customer(4, "c4", "Tanzania", "No.203", "6152017624", "10%", "yes", 2400, "Prepaid", "yes", true));
		clist.add(new Customer(5, "c5", "South Africa", "No.203", "9952017625", "10%", "yes", 9400, "Postpaid", "yes",
				false));
		clist.add(new Customer(6, "c6", "South Africa", "No.203", "9952017626", "10%", "yes", 7400, "Prepaid", "yes",
				true));
		clist.add(new Customer(7, "c7", "Uganda", "No.203", "9952017627", "10%", "yes", 2300, "Postpaid", "no", false));
		clist.add(new Customer(8, "c8", "South Africa", "No.203", "9952017628", "10%", "yes", 6400, "Prepaid", "no",
				true));
		clist.add(new Customer(9, "c9", "South Africa", "No.203", "9952017629", "10%", "yes", 1400, "Postpaid", "no",
				false));
		clist.add(
				new Customer(10, "c20", "Tanzania", "No.203", "9952017610", "10%", "yes", 1400, "Prepaid", "no", true));
		clist.add(new Customer(11, "c11", "Uganda", "No.203", "6152017611", "10%", "yes", 1400, "Postpaid", "yes",
				false));
		clist.add(
				new Customer(12, "c123", "Uganda", "No.203", "9952017612", "10%", "yes", 1400, "Prepaid", "yes", true));
		clist.add(new Customer(13, "c22", "South Africa", "No.203", "9952017613", "10%", "yes", 1400, "Postpaid", "yes",
				false));

		System.out.println("Enter no of records:");
		int n = sc.nextInt();
		if (n >= 10) {
			System.out.println("Limited records");
			getRecords(clist, 10);
		} else {
			System.out.println("Display The Data");
			getRecords(clist, n);
		}

		String cname;
		String phone;
		String custid;
		System.out.println("Enter The Customer Name");
		cname = sc.next();
		System.out.println("Enter The Customer Phone Number");
		phone = sc.next();
		System.out.println("Enter The Customer id");
		custid = sc.next();

		System.out.println("Sort By Customer Country");
		searchCountry(clist);
		System.out.println("Sort By Customer Code");
		searchCountryCon(clist);
		System.out.println("Sort By Name And Phone Number");
		searchCustNameAndPhoneNumber(clist, cname, phone);
		System.out.println("Sort By Base Number");
		sortBaseNumber(clist);
		System.out.println("Convert All Name to Uppercase");
		sortBaseNumber(clist);

	}

	public static void getRecords(List<Customer> cust, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(cust.get(i));
		}

	}

	public static void searchCountry(ArrayList<Customer> cust) {
		cust.stream()
				.filter(c -> c.baseCountry.equals("Tanzania") && c.description.equals("Postpaid") && c.vas.equals("no"))
				.collect(Collectors.toSet()).forEach(System.out::println);
	}

	public static void searchCountryCon(ArrayList<Customer> cust) {
		cust.stream().filter(
				c -> c.baseCountry.equals("South Africa") && c.description.equals("Prepaid") && c.isActive == true)
				.map(c -> c).forEach(System.out::println);
	}

	public static void sortBaseNumber(ArrayList<Customer> cust) {
		cust.stream().filter(c -> c.baseCountry.equals("Uganda") && c.phoneNumber.startsWith(c.phoneNumber, 61)
				&& c.is4g.equals("yes")).map(c -> c).forEach(System.out::println);
	}

	public static void searchCustNameAndPhoneNumber(ArrayList<Customer> cust, String custName, String phonenumber) {
		cust.stream().filter(c -> c.customerName.equals(custName) && c.phoneNumber.equals(phonenumber)).map(c -> c)
				.forEach(System.out::println);
	}

	public void printCustomerId(ArrayList<Customer> cust, String custid) {
		List<Customer> l = cust.stream().filter(c -> c.customerId.equals(custid)).collect(Collectors.toList());
		if (l.isEmpty()) {
			System.out.println("No Record Found");
		} else {
			System.out.println(l);
		}

	}

	public static void sortBaseNumber(ArrayList<Customer> cust) {
		cust.stream().filter(c -> c.baseCountry.equals("Nigeria") && c.phoneNumber.startsWith(c.phoneNumber, 56))
				.map(c -> c.customerName.toUpperCase()).forEach(System.out::println);
	}

}
