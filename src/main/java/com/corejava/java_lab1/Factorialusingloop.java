package com.corejava.java_lab1;

import java.util.Scanner;

public class Factorialusingloop {
    public static void main(String[] args) {
        int num;
        System.out.printf("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        int factorial = 1;
        for (int i = 1; i <= num; ++i) {

            factorial *= i;
        }
        System.out.printf("Factorial of" + "  " + num + " = " + factorial);
    }

}
