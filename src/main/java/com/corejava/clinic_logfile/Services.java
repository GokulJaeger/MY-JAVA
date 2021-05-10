package com.corejava.clinic_logfile;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public final class Services {
    private Services() {
    }

    public static void writeCsv(List<Clinic> cllist, List<Records> nrlist) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("Clinic.csv"))) {
            for (int i = 0; i < cllist.size(); i++) {
                Clinic c = cllist.get(i);
                String[] str = { c.getDate(), c.getRegion(), c.getCtype(), String.valueOf(c.getNorec()), c.getSeq() };
                writer.writeNext(str);
                writer.flush();
            }
            for (int j = 0; j < nrlist.size(); j++) {
                Records r = nrlist.get(j);
                String[] str2 = { r.getId(), r.getRef(), String.valueOf(r.getAge()), String.valueOf(r.values[5]),
                        String.valueOf(r.values[1]), String.valueOf(r.values[0]), String.valueOf(r.values[3]),
                        String.valueOf(r.values[2]), String.valueOf(r.values[4]) };
                writer.writeNext(str2);
                writer.flush();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void checkList(List<Records> relist, List<Clinic> cllist, int rno, int count) {
        List<Records> nrlist = new ArrayList<>();
        List<Records> drlist = new ArrayList<>();

        if (rno == count) {
            for (int k = 0; k < relist.size(); k++) {
                Records r1 = relist.get(k);
                if (r1.values[5] > 0 && r1.getAge() > 0 && r1.values[1] > 0 && r1.values[0] > 0 && r1.values[3] > 0
                        && r1.values[2] > 0 && r1.getRef() != null && r1.values[4] > 0 && checkAgeVale(r1.values[3],r1.getAge()) && checkLcdPcs(r1.values[1],r1.values[2])) {
                            System.out.println(r1.getRef() + ": Checked");
                            nrlist.add(r1);
                    }else {
                    System.out.println(r1.getRef() + ": Record Incomplete!");
                    drlist.add(r1);
                }
        }
    }else{
        System.out.println("Records do not match the total count!");
    System.out.println("Correct List");
        }
    for(int m = 0;m<nrlist.size();m++){
        Records nr = nrlist.get(m);
        System.out.println(nr);
    }
    System.out.println("Incorrect List");for(
    int n = 0;n<drlist.size();n++)
    {
        Records dr = drlist.get(n);
        System.out.println(dr);
    }System.out.println("Want to convert checked record to CSV: (y/n)");
    Scanner se = new Scanner(System.in);
    String ch = se.next();if(ch.equalsIgnoreCase("y"))
    {
        writeCsv(cllist, nrlist);
    }else
    {
        System.out.println("Thank You");
    }se.close();
    }

    public static boolean checkAgeVale(double a, double b) {
        if(a>5.0 && b<45 ){
            return true;
        }else{
        return false;
        }
    }

    public static boolean checkLcdPcs(double x, double y) {

        return false;
    }
}
