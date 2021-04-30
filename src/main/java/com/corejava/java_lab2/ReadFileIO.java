package com.corejava.java_lab2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileIO {
    public static void main(String[] args) {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            File inputFile = new File("./src/main/java/com/corejava/java_lab2/Abdul.txt");
            File outFile = new File("./src/main/java/com/corejava/java_lab2/CopyFile.txt");

            inStream = new FileInputStream(inputFile);
            outStream = new FileOutputStream(outFile);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            inStream.close();
            outStream.close();

            System.out.println("Copied to another file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
