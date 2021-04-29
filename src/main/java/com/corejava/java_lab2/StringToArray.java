package com.corejava.java_lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5]; 

        System.out.println("Enter names:");
        for(int i=0;i<5;i++){
            names[i] = sc.nextLine();
        }

        List<String> alist = new ArrayList<String>();
        for(String st:names){
            alist.add(st);
        }
        System.out.println("Array List:" + alist);

        sc.close();
    }
}
