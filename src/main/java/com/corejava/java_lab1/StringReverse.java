package com.corejava.java_lab1;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String givenString, reverseString = "";
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		givenString = sc.nextLine();
		sc.close();
		int len = givenString.length();
		for (int i = len - 1; i >= 0; i--) {
			reverseString = reverseString + givenString.charAt(i);

		}
		System.out.println("============================");
		System.out.println(reverseString);

	}

}
