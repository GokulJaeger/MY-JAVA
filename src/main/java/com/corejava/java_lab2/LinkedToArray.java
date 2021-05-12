package com.corejava.java_lab2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> llist = new LinkedList<>();

        llist.add("Gokul");
        llist.add("Rikhitha");
        llist.add("Srinath");
        llist.add("Kishore");
        llist.add("Lathu");
        llist.add("Sumathy");
        llist.add("Lokesh");
        System.out.println("The Linked List:" + llist);

        List<String> alist = new ArrayList<>(llist);
        System.out.println("The Array List: ");
        for(Object i:alist){
            System.out.println(i);
        }
        sc.close();
    }
}
