package com.corejava.java_lab2;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        int num = 0;
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        try {
        num = scanner.nextInt();
        if (num == 0) {
            System.out.print("Number in words: Zero");
        } else {
            System.out.print("Number in words: " + wordConvert(num));
        }
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
        scanner.close();
    }
    private static String wordConvert(int n) { 
        String words = "";
        String[] unitsArray = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	String[] tensArray = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
 
	if (n == 0) {
	    return "zero";
	}
	if (n < 0) { 
        String numstr = "" + n;  
        numstr = numstr.substring(1);  
        return "minus " + wordConvert(Integer.parseInt(numstr)); 
    }
    if ((n / 1000000) > 0) {
	   words += wordConvert(n / 1000000) + " million ";
	   n %= 1000000;
	}
	if ((n / 1000) > 0) {
	    words += wordConvert(n / 1000) + " thousand ";
	    n %= 1000;
	}
	if ((n / 100) > 0) {
	    words += wordConvert(n / 100) + " hundred ";
	    n %= 100;
	}
 
	if (n > 0) {
	    if (n < 20) { 
            words += unitsArray[n];
        } 
        else { 
            words += tensArray[n / 10]; 
            if ((n % 10) > 0) {
		        words += "-" + unitsArray[n % 10];
            }  
	     }
    }
	return words;
   }
}
