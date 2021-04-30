package com.corejava.java_lab2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapSortKey {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "Gokul");
        hmap.put(11, "Latha");
        hmap.put(7, "Srinath");
        hmap.put(77, "Sumathy");
        hmap.put(9, "Kishore");
        hmap.put(66, "Lokesh");
        hmap.put(0, "Rikhitha");
        hmap.put(19, "Shanmuga Priya");
        hmap.put(54, "Gayathri");
        hmap.put(31, "Vijaya Lakshmi");
        hmap.put(20, "Shiny Felicita");

        System.out.println("Before sorting of Data:");
        Set<?> set = hmap.entrySet();
        Iterator<?> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> me = (Entry<Integer, String>) iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        System.out.println("After sorting by Key:");
        Set<?> set2 = map.entrySet();
        Iterator<?> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> me2 = (Entry<Integer, String>) iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
}