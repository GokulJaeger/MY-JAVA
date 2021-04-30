package com.corejava.java_lab1;

import java.util.Scanner;

public class SwappingWith3Variables {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		swap(x, y);
	}

	private static void swap(int x, int y) {
		int z = x;
		x = y;
		y = z;

		System.out.println("After Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);
	}
}
