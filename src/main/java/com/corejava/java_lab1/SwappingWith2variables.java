package com.corejava.java_lab1;

import java.util.Scanner;

public class SwappingWith2variables {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		System.out.println("Before swapping" + " " + "a =" + " " + a + " " + "b =" + " " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping" + " " + "a =" + " " + a + " " + "b =" + " " + b);

	}

}
