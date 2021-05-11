package com.corejava.java_lab1;

import java.util.Scanner;

public class Factorialusingloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();
        sc.close();
        int factorial = 1;
        for (int i = 1; i <= num; ++i) {

            factorial *= i;
        }
        System.out.format("Factorial of %d = %d ",num, factorial);
    }

}
