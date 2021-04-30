package com.corejava.java_lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapSortValue {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>();
        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        hMap.put(5, "Gokul");
        hMap.put(11, "Latha");
        hMap.put(7, "Srinath");
        hMap.put(77, "Sumathy");
        hMap.put(9, "Kishore");
        hMap.put(66, "Lokesh");
        hMap.put(0, "Rikhitha");
        hMap.put(19, "Shanmuga Priya");
        hMap.put(54, "Gayathri");
        hMap.put(31, "Vijaya Lakshmi");
        hMap.put(20, "Shiny Felicita");

        System.out.println("Before sorting of Data:");
        Set<?> set = hMap.entrySet();
        Iterator<?> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> me = (Entry<Integer, String>) iterator.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        
        for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<String>() {
            public int compare(String str, String str1) {
                return (str).compareTo(str1);
            }
        });
        for (String str : list) {
            for (Entry<Integer, String> entry : hMap.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }

        System.out.println("After sorting by Value:");
        Set<?> set1 = sortedMap.entrySet();
        Iterator<?> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> me = (Entry<Integer, String>) iterator1.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
