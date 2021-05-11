package com.corejava.java_lab1;

import java.util.Scanner;

public class InsertionSort {
	public static void sort(int[] a) {
		int n = a.length;
		int i;
		int j;
		int temp;
		for (i = 1; i < n; i++) {

			for (j = i - 1; j >= 0 && a[j + 1] < a[j]; j--) {
				temp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = temp;

			}

		}
	}

	public static void printarray(int a[]) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("elements in array ");
		printarray(a);
		sort(a);
		System.out.println("\nelements after sorting");
		printarray(a);

		s.close();

	}

}
