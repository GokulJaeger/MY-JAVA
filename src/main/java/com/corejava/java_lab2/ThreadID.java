package com.corejava.java_lab2;

class ThId implements Runnable
{ 
    public void run()     { 
        try  { 
            // Displaying the thread that is running 
            System.out.println ("Thread ID: " + Thread.currentThread().getId() + " running"); 
          } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
public class ThreadID {
    public static void main(String[] args) {

        int n = 8; 
        for (int i=0; i<n; i++){ 
			Thread object = new Thread(new ThId()); 
			object.start(); 
        }
    }
}
