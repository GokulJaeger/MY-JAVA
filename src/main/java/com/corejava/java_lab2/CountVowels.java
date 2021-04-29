package com.corejava.java_lab2;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String str2 = str.toLowerCase();
        int count = 0;
        sc.close();
        for (int i=0 ; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
               count ++;
            }
        }
        System.out.println("String is: " + str);
        System.out.println("Number of Vowels in the string is : " + count);
    }
}
