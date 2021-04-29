package com.corejava.java_lab2;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to be removed:");
        String c = sc.nextLine();
        String str1 = str.replace(c.toLowerCase(),"");
        String str2 = str1.replace(c.toUpperCase(),"");
        System.out.println(str2);
        sc.close();
    }
}
