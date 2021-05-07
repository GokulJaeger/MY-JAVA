package com.corejava.car_manu;

import java.io.IOException;

public class TextFileReader {
    public static void main(String[] args) throws IOException {
        System.out.println("Create the File");
        FileReaderImpl.createFile();
		
		
		System.out.println("It Will Display All Records");
	    FileReaderImpl.display();
    }
}
