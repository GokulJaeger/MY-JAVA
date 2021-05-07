package com.corejava.car_manu;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class Filereader {
    
    static boolean valiFile(String txt) throws IOException
	{
		  FileInputStream fis = new FileInputStream(txt);
	      FileDescriptor fd = null;
	      boolean bool = false;  
	      try {  
	         fd = fis.getFD();
	         bool = fd.valid();
	       
	        
	      } catch(Exception e) {
	         e.printStackTrace();
	      } finally {
	         if(fis!= null){
	            fis.close();
             }   
	      }
		return bool;
			
	}
}
