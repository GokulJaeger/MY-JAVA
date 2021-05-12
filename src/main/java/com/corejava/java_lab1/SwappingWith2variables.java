package com.corejava.java_lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class SwappingWith2variables {
	public static final Logger logger = Logger.getLogger(SwappingWith2variables.class.getName());
	public static void main(String[] args) {
	

		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		Logger.getLogger("Enter the Values of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		logger.info("Before swappin a = {0}, b = {1}"+a);

		a = a + b;
		b = a - b;
		a = a - b;
		logger.info("After Swapping" + " " + "a =" + " " + a + " " + "b =" + " " + b);

	}

}
