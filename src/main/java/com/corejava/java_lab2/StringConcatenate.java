package com.corejava.java_lab2;

import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firts_name: ");
        String fname = sc.nextLine();
        System.out.println("Enter last_name: ");
        String lname = sc.nextLine();
        String name = "Mr./Mrs./Miss " + fname + " " + lname;

        System.out.println("Welcome " + name);
        sc.close();
    }
}
