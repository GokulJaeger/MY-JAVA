package com.corejava.java_lab2;

import java.util.ArrayList;

public class ArrayToString {
    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<>();

        alist.add("Gokul");
        alist.add("Rikhitha");
        alist.add("Srinath");
        alist.add("Kishore");
        alist.add("Lathu");
        alist.add("Sumathy");
        alist.add("Lokesh");
        System.out.println("Array List: " + alist);


        String[] arr = new String[alist.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = alist.get(i);
        }

        System.out.println("String array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
