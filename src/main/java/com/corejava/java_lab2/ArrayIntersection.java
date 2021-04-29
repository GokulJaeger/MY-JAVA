package com.corejava.java_lab2;

public class ArrayIntersection {
    public static void main(String[] args) {
        System.out.println("Array Intersection Point");
        int[] arr1 = { 93, 56, -12, 78, 53 };
        int[] arr2 = { 18, 53, -12, 148, 80 };
        System.out.println("Intersecting values of two array:");

        intersect(arr1,arr2);
    }
    public static void intersect(int[] m1, int[] m2){
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                if (m1[i] == m2[j]) {
                    System.out.println(m2[j]);
                }
            }
        }
    }
}
