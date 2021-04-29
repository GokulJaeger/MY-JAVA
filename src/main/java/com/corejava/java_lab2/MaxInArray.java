package com.corejava.java_lab2;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The Maximum value is: " + getMaxValue(numbers));
        sc.close();
    }

    static int getMaxValue(int[] num) {
        int maxValue = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxValue) {
                maxValue = num[i];
            }
        }
        return maxValue;
    }
}
