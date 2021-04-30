package com.corejava.java_lab1;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListSort {
    public static void main(String[] args) {
        LinkedList<String> listOfNames = new LinkedList<String>();

        listOfNames.add("D");
        listOfNames.add("A");
        listOfNames.add("Z");
        listOfNames.add("Y");
        listOfNames.add("X");

        System.out.println("Before sorting: " + listOfNames);
        listOfNames.sort(new MyComparator());
        System.out.println("After sorting: " + listOfNames);
    }
}

class MyComparator implements Comparator<String> {
    public int compare(String string1, String string2) {
        return string1.compareTo(string2);
    }
}
