package com.corejava.java_lab2;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word:");
        String str= s.nextLine();
        System.out.println("Unique Characters in a String: " + uniquechar(str));
        s.close();
    }
    static boolean uniquechar(String sr) {
        for(int i=0; i < sr.length(); i++) {
            for(int j=0; j < sr.length(); j++) {
                if(i == j)
                    continue;
                if(sr.charAt(i) == sr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
