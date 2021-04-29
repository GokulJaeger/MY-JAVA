package com.corejava.java_lab2;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {21,656,89,32,168,213,0331,348,0,50,4530,4,6553};
        System.out.println("Int Array Values: ");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        reverseArray(nums);
    }
    static void reverseArray(int[] arr){
        System.out.println("Reverse Int Array : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
