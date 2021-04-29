package com.corejava.java_lab2;

import java.util.Scanner;

public class ReplaceWhiteSpace {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = as.nextLine();
        System.out.println("The String : " + str);
        removespace(str);
        
        as.close();
    }
    static void removespace(String astr){
        if(astr.length() == 0){
            System.out.println("String Empty!");
        }
        else{
            System.out.println("White Space Removed : " + astr.replace(" ", "") + "");
        }
    }
}
