package com.corejava.java_lab1;

import java.util.LinkedList;

public class LengthOfLinkedList {
    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("Shri");
        list.add("kishore");
        list.add("lokesh");
        list.add("latta");
        list.add("gokul");

        System.out.println("LinkedList:" + list);

        System.out.println("The size of the linked list is: " + list.size());
    }

}
