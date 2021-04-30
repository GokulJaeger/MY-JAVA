package com.corejava.java_lab1;

import java.util.Scanner;

public class DupilicateString {
	public static void main(String argu[]) {
		String str;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		sc.close();
		char[] carray = str.toCharArray();
		System.out.println("The string is:" + str);
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (carray[i] == carray[j]) {
					System.out.print(carray[j] + " ");
					break;
				}
			}
		}
	}

}
