package com.corejava.java_lab1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = scn.nextLine();
		
		int i;
		int strLen = str.length();
		i = strLen - 1;
		String[] revStr = new String[i];

		scn.close();

		while (i >= 0) {
			revStr[i]=String.valueOf(str.charAt(i));
			i--;
		}
		if (str.equals(revStr)) {
			System.out.println(str + " IS A PALINDROME STRING");
		} else {
			System.out.println(str + " IS A NOT PALINDROME STRING");
		}
	}
}
