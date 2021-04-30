package com.corejava.java_lab1;

import java.util.Scanner;

public class StringPremutation {
	public static void main(String[] args) {
		String mystr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		mystr = sc.nextLine();
		permutationWithRepeation(mystr);

		sc.close();
	}

	private static void permutationWithRepeation(String mystr) {
		System.out.println("The given string is: " + mystr);
		System.out.println("The permuted strings are:");
		showPermutation(mystr, "");
	}

	private static void showPermutation(String mystr, String NewStringToPrint) {

		if (NewStringToPrint.length() == mystr.length()) {
			System.out.println(NewStringToPrint);
			return;
		}
		for (int i = 0; i < mystr.length(); i++) {

			showPermutation(mystr, NewStringToPrint + mystr.charAt(i));
		}
	}
}
