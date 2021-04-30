package com.corejava.java_lab2;

import java.util.ArrayList;

public class ArrayDescOrder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();   
        names.add("Gokul");
        names.add( "Latha");
        names.add("Srinath");
        names.add( "Sumathy");
        names.add("Kishore");
        names.add( "Lokesh");
        names.add("Rikhitha");
        names.add( "Shanmuga Priya");
        names.add( "Gayathri");
        names.add( "Vijaya Lakshmi");
        names.add( "Shiny Felicita");
        System.out.println("Arraylist unordered:");
        System.out.println(names);
        int count = names.size();
        String temp;
        Object[] name = names.toArray();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (((String) name[i]).compareTo((String) name[j]) > 0) {
                    temp = (String) name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("Arraylist descending :");
        for (int a = name.length-1; a>=0; a--) {
            System.out.println(name[a]);
        }
        System.out.println("Arraylist Ascending :");
        for (int a = 0; a<name.length; a++) {
            System.out.println(name[a]);
        }
    }
}
