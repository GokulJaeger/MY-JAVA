package com.corejava.java_lab2;

import java.util.Scanner;

public class UppercaseLowercase {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter string: ");
      String str = sc.nextLine();
      System.out.println("Enter case: 1. Uppercase\t2.Lowercase\t3.Exit");
      int ch = sc.nextInt();
      switch (ch) {
      case 1:
         uppercase(str);
         break;
      case 2:
         lowercase(str);
         break;
      case 3:
         break;
      default:
         System.out.println("Error!");
      }

      sc.close();

   }

   static void uppercase(String strn) {
      char[] sr = strn.toCharArray();
      for (int i = 0; i < sr.length; i++) {
         if (sr[i] >= 'a' && sr[i] <= 'z') {
            sr[i] = (char) ((int) sr[i] - 32);
         }
      }
      System.out.println("The string in UpperCase is: ");
      for (int i = 0; i < sr.length; i++)
         System.out.print(sr[i]);
   }

   static void lowercase(String strn) {
      char[] st = strn.toCharArray();
      for (int i = 0; i < st.length; i++) {
         if (st[i] >= 'A' && st[i] <= 'Z') {
            st[i] = (char) ((int) st[i] + 32);
         }
      }
      System.out.println("The string in LowerCase is: ");
      for (int i = 0; i < st.length; i++)
         System.out.print(st[i]);
   }
}
