package com.corejava.java_lab1;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the list of numbers:");
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

	}

}
