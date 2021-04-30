package com.corejava.java_lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadBuffer {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("./src/main/java/com/corejava/java_lab2/Abdul.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
