package com.corejava.air_voice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AirVoice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> cuslist = new ArrayList<>();
		cuslist.add(new Customer(1, "Gokul", "India", "No.203", "9710526061", "10%", "yes", 1400, "Prepaid",
				"yes", true));
		cuslist.add(new Customer(2, "Srinath", "North Korea", "No.2103", "9952017621", "10%", "yes", 1300, "Postpaid",
				"yes", true));
		cuslist.add(new Customer(3, "Rikhitha", "Europe", "No.212/14", "6152017623", "10%", "yes", 1200, "Postpaid",
				"no", false));
		cuslist.add(new Customer(4, "Latha", "Thai", "No.32", "6152017624", "10%", "yes", 2400, "Prepaid", "yes",
				true));
		cuslist.add(new Customer(5, "Kishore", "SouthernLAnd", "No.23", "9952017625", "10%", "yes", 9400, "Postpaid",
				"yes", false));
		cuslist.add(new Customer(6, "Lokesh", "Africa", "No.03", "9952017626", "10%", "yes", 7400, "Prepaid",
				"yes", true));
		cuslist.add(new Customer(7, "Sumathy", "Kong Island", "No.004", "9952017627", "10%", "yes", 2300, "Postpaid", "no",
				false));
		cuslist.add(new Customer(8, "Shanmuga Priya", "Congo", "No.28", "9952017628", "10%", "yes", 6400,
				"Prepaid", "no", true));
		cuslist.add(new Customer(9, "Vijayalakshmi", "Newzland", "No.96", "9952017629", "10%", "yes", 1400,
				"Postpaid", "no", false));
		cuslist.add(new Customer(10, "Shiny Felicita", "Tanzania", "No.A/5", "9952017610", "10%", "yes", 1400,
				"Prepaid", "no", true));
		cuslist.add(new Customer(11, "Gayathri", "Ukraine", "No.12/E", "6152017611", "10%", "yes", 1400, "Postpaid",
				"yes", false));
		cuslist.add(new Customer(12, "Sweatha", "Uganda", "No.A8", "6152017612", "10%", "yes", 1400, "Prepaid", "yes",
				true));
		cuslist.add(new Customer(13, "Pavithra", "South Africa", "No.C6", "9952017613", "10%", "yes", 1400, "Prepaid",
				"yes", true));

		System.out.println("Enter no of records:");
		int n = sc.nextInt();
		if (n >= 10) {
			System.out.println("Limited records");
			getRecords(cuslist, 10);
		} else {
			System.out.println("Display The Data");
			getRecords(cuslist, n);
		}

		String cname;
		String phone;
		int custid;
		System.out.println("Enter The Customer Name");
		cname = sc.next();
		System.out.println("Enter The Customer Phone Number");
		phone = sc.next();
		System.out.println("Enter The Customer id");
		custid = sc.nextInt();

		System.out.println("Sort By Customer Country");
		searchCountry(cuslist);
		System.out.println("Sort By Customer Code");
		searchCountryCon(cuslist);
		System.out.println("Record of Name " + cname + " and Phone Number:" + phone);
		searchCustNameAndPhoneNumber(cuslist, cname, phone);
		System.out.println("Sort By Number");
		sortBaseNumber(cuslist);
		System.out.println("Convert All Name to Uppercase");
		convertUppercase(cuslist);
		System.out.println("Customer :" + custid + " details=");
		printCustomerId(cuslist, custid);

		sc.close();

	}

	public static void getRecords(List<Customer> cust, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(cust.get(i));
		}

	}

	public static void searchCountry(List<Customer> cust) {
		cust.stream().filter(c -> c.baseCountry.equals("Tanzania")).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	public static void searchCountryCon(List<Customer> cust) {
		cust.stream().filter(
				c -> c.baseCountry.equals("South Africa") && c.description.equals("Prepaid") && c.isActive == true)
				.map(c -> c).forEach(System.out::println);
	}

	public static void sortBaseNumber(List<Customer> cust) {
		Collections.sort(cust, new CompareNum());
		System.out.println(cust);
	}

	public static void searchCustNameAndPhoneNumber(List<Customer> cust, String custName, String phonenumber) {
		cust.stream().filter(c -> c.customerName.equals(custName) || c.phoneNumber.equals(phonenumber)).map(c -> c)
				.forEach(System.out::println);
	}

	public static void printCustomerId(List<Customer> cust, int cid) {
		List<Customer> l = cust.stream().filter(c -> c.customerId == cid).collect(Collectors.toList());
		if (l.isEmpty()) {
			System.out.println("No Record Found");
		} else {
			System.out.println(l);
		}

	}

	public static void convertUppercase(List<Customer> cust){
		cust.stream().map(c -> c.customerName.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		
	}
}

class CompareNum implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
	}

}
