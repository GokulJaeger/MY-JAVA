package com.corejava.java_lab2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapRemoveKey {
    public static void main(String[] args) {

        Scanner sd = new Scanner(System.in);
        HashMap<Integer, String> hmaP = new HashMap<>();
        hmaP.put(5, "Gokul");
        hmaP.put(11, "Latha");
        hmaP.put(7, "Srinath");
        hmaP.put(77, "Sumathy");
        hmaP.put(9, "Kishore");
        hmaP.put(66, "Lokesh");
        hmaP.put(0, "Rikhitha");
        hmaP.put(19, "Shanmuga Priya");
        hmaP.put(54, "Gayathri");
        hmaP.put(31, "Vijaya Lakshmi");
        hmaP.put(20, "Shiny Felicita");

        System.out.println("Before Removing of Data:");
        Set<?> set = hmaP.entrySet();
        Iterator<?> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> me = (Entry<Integer, String>) iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println("Enter key to remove: ");
        int n = sd.nextInt();
        hmaP.remove(n);

        System.out.println("After removing: " + n + " from Hashmap!");
        Set<?> set1 = hmaP.entrySet();
        Iterator<?> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> me = (Entry<Integer, String>) iterator1.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        sd.close();
    }
}
