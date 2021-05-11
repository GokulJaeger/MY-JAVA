package com.corejava.java_lab1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = scn.nextLine();
		String revStr = "";
		int i;
		int strLen = str.length();
		i = strLen - 1;

		scn.close();

		while (i >= 0) {
			revStr +=  str.charAt(i);
			i--;
		}
		if (str.equals(revStr)) {
			System.out.println(str + " IS A PALINDROME STRING");
		} else {
			System.out.println(str + " IS A NOT PALINDROME STRING");
		}
	}
}
