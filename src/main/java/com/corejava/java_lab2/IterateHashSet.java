package com.corejava.java_lab2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashSet {
    public static void main(String[] args) {
        Set<Integer> marks = new HashSet<>();
        marks.add(70);
        marks.add(36);
        marks.add(82);
        marks.add(75);
        marks.add(98);
        marks.add(86);
        marks.add(56);
        marks.add(70);
        marks.add(89);
        System.out.println("Marks: " + marks);
        Iterator<Integer> itr = marks.iterator();
        System.out.println("Iterating over Marks:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
    }
}
