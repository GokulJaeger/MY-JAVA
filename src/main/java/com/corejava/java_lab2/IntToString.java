package com.corejava.java_lab2;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer Value: ");
        int a = sc.nextInt();
        System.out.println("Integer to String Converted: " + Integer.toString(a));
        sc.close();
    }
}
