package com.corejava.car_manu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReaderImpl extends Filereader {
    static String txt = "";

    static void createFile() {
        try {
            File myObj = new File("carfile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                new Utility().addData();
            } else {
                System.out.println("File already exists.");
                readFileIntoList();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static List<String> readFileIntoList() {
        BufferedReader br;
        ArrayList<String> listOfLines = new ArrayList<>();
        Path file = Paths.get("carfile.txt");
        try(BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            
            txt = file.getName();
            if (valiFile(txt) != false) {
                br = new BufferedReader(reader);
                String line = br.readLine();
                while (line != null) {
                    listOfLines.add(line);
                    line = br.readLine();
                }
                br.close();
            } else {
                listOfLines.add(null);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return listOfLines;
    }

    public static void convertCsv() throws IOException {
        String[] val = txt.split(".");
        final Path path = Paths.get("path", "to", "folder");
        final Path txt1 = path.resolve(txt);
        final Path csv = path.resolve(val[0] + ".csv");
        try (final Stream<String> lines = Files.lines(txt1);
                final PrintWriter pw = new PrintWriter(Files.newBufferedWriter(csv, StandardOpenOption.CREATE_NEW))) {
            lines.map((line) -> line.split("\\|")).map((line) -> Stream.of(line).collect(Collectors.joining(",")))
                    .forEach(pw::println);
        }
    }

    public void writeFile(List<CarHeader> h, List<CarContent> c) throws IOException {

        FileWriter writer = new FileWriter("carfile.txt");
        int i = 0;
        for (CarHeader hd : h) {

            writer.write("****" + hd.getDate() + "****" + hd.getFiSeq() + "*******" + hd.getmName() + "****"
                    + hd.getNor() + "****" + hd.getTot() + "****" + System.lineSeparator());
        }
        for (CarContent cn : c) {
            writer.write(i + "****" + cn.getMono() + "****" + cn.getSku() + "****" + cn.getIsfragile() + "****"
                    + cn.getColr() + "****" + cn.getCostStep() + "****" + System.lineSeparator());
        }
        writer.close();
    }

    public static void display() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        list.addAll(readFileIntoList());
        if (list.isEmpty()) {
            System.out.println("No Records Found");
        } else {
            for (String l : list) {
                System.out.println(l);
                count++;
            }
            System.out.println(count);
            convertCsv();
        }

    }
}
