package com.corejava.java_lab1;

import java.util.Scanner;

public class FactorialUsingRecursive {
	public static long factorial(int i) {
		if (i <= 1) {
			return 1;
		}
		return i * factorial(i - 1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		sc.close();
		System.out.println("Factorial of the given number is ::" + factorial(i));
	}

}
