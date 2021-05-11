package com.corejava.java_lab1;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		s = sc.nextLine();
		sc.close();
		System.out.print(" reverse string is: ");
		int i = s.length();
		while (i > 0) {
			System.out.print(s.charAt(i - 1));
			i--;
		}
	}
}
