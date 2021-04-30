package com.corejava.java_lab1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created::");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the elements of the array ::");
		for (int i = 0; i < size; i++) {
			myArray[i] = sc.nextInt();
		}
		sc.close();

		int[] uniqueArr = new int[myArray.length];
		int counter = 0;
		Arrays.sort(myArray);
		for (int i = 0; i < myArray.length - 1; i++) {
			if (myArray[i] != myArray[i + 1]) {
				uniqueArr[counter] = myArray[i];
				counter++;
			}
		}
		uniqueArr[counter] = myArray[myArray.length - 1];
		System.out.println("Array with Unique Elements : ");
		for (int i = 0; i <= counter; i++) {
			System.out.println(uniqueArr[i]);
		}
	}

}
