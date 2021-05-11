package com.corejava.java_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Init {
    public static void main(String[] args) throws IOException {

        Path file = Paths.get("CarManuRecords.txt");
        List<String> head = new ArrayList<>();
        List<String> cont = new ArrayList<>();
        ArrayList<Header> hlist = new ArrayList<>();
        ArrayList<Contents> clist = new ArrayList<>();
        String hl;
        String cl;
        String[] hf;
        String[] cf;
        

        try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {

            hl = br.readLine();
            head.add(hl);
            for (int i = 0; i < head.size(); i++) {
                hf = head.get(i).split("%");
                hlist.add(new Header(hf[0], hf[2], Integer.parseInt(hf[7]), hf[11], Double.parseDouble(hf[14])));
            }

            while ((cl = br.readLine()) != null) {
                cont.add(cl);
            }
            for (int j = 0; j < cont.size(); j++) {
                cf = cont.get(j).split("%");
                String[] mcl = new String[2];
                mcl[0] = cf[12];
                mcl[1] =  cf[18];
                clist.add(new Contents(cf[0], cf[2], Long.parseLong(cf[5]), cf[8], cf[10].charAt(0), mcl ,
                        Double.parseDouble(cf[20])));
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }

        System.out.println("Header:\n");
        for (int i = 0; i < hlist.size(); i++) {
            Header h = hlist.get(i);
            System.out.println(h);
        }
        System.out.println("\nContents:\n");
        for (int j = 0; j < clist.size(); j++) {
            Contents c = clist.get(j);
            System.out.println(c);
        }

        try{
            FileProcessing.dataValid(hlist, clist);
        }catch(Exception e){
            System.out.println("Exception Issued:====>" + e);
        }
    }
}
