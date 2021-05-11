package com.corejava.java_io;

import java.io.FileWriter;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public final class FileProcessing {
    private FileProcessing() {

    }

    public static void dataValid(List<Header> hlist, List<Contents> cl) throws ParseException {

        int count = 0;
        double tcost = 0.00;
        String str;
        for (int i = 0; i < hlist.size(); i++) {
            Header h = hlist.get(i);
            count += h.getNor();
            tcost += h.getTcost();
            str = h.getSeq();
            if (h.getDate() != null && h.getMname() != null && h.getNor() > 0 && h.getSeq() != null
                    && h.getTcost() > 0) {
                System.out.println("Header Checked.");
                checkCount(cl, str, count, tcost, hlist);

            }
        }

    }

    private static void checkCount(List<Contents> clist, String seq, int ct, double tc, List<Header> hl)
            throws ParseException {

        DecimalFormat df = new DecimalFormat("#.##");
        int ncnt = 0;
        double ntc = 0.0;
        String fntc;
        for (int i = 0; i < clist.size(); i++) {
            Contents c1 = clist.get(i);
            if (c1.getId().startsWith(seq)) {
                ncnt += 1;
                ntc += c1.getCost();
            }
        }
        fntc = df.format(ntc);
        if ((ncnt == ct) && (fntc.equals(String.valueOf(tc)))) {
            dataProcs(clist, seq, hl);
        } else {
            System.out.println("Invalid Records!\n At no.of records.");
        }
    }

    public static void dataProcs(List<Contents> clist, String seq, List<Header> hlt) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = new Date();
        String cdate = formatter.format(dt);
        ArrayList<Contents> nclist = new ArrayList<>();
        ArrayList<Contents> rclist = new ArrayList<>();

        for (int j = 0; j < clist.size(); j++) {
            Contents c = clist.get(j);
            if (c.getId().startsWith(seq)) {
                Date datemanu = formatter.parse(c.getDom());
                Date todaydate = formatter.parse(cdate);
                long difference = todaydate.getTime() - datemanu.getTime();
                float manudiff = (difference / (1000 * 60 * 60 * 24));
                if ((manudiff < 30.0) && (manudiff >3.0)) {
                    System.out.println(c.getId() + ": Checked");
                    nclist.add(c);
                } else {
                    System.out.println(c.getId() + ": Invalid Data");
                    rclist.add(c);
                }
            } else {
                System.out.println(c.getId() + ": Invalid Data");
                rclist.add(c);
            }
        }
        System.out.println("Correct list:");
        for (Contents c1 : nclist) {
            System.out.println(c1);
        }

        System.out.println("Incorrect list:");
        for (Contents c2 : rclist) {
            System.out.println(c2);
        }

        convertCsv(hlt, nclist);
    }

    public static void convertCsv(List<Header> chlist, List<Contents> cclist) {
        Scanner sc = new Scanner(System.in);
        String ch;
        System.out.println("Do you want to convert the correct list to CSV file: (Y/N)");
        ch = sc.next();
        if (ch.equalsIgnoreCase("y")) {
            try (CSVWriter writer = new CSVWriter(new FileWriter("CarManuRecords.csv"))) {
                for (int i = 0; i < chlist.size(); i++) {
                    Header h = chlist.get(i);
                    String[] str = { h.getDate(), h.getMname(), String.valueOf(h.getNor()), h.getSeq(),
                            String.valueOf(h.getTcost()) };
                    writer.writeNext(str);
                    writer.flush();
                }
                for (Contents co : cclist) {

                    String[] str2 = { co.getId(), co.getCatg(), String.valueOf(co.getSku()), co.getDom(),
                            String.valueOf(co.getIsf()), co.mc[0], co.mc[1], String.valueOf(co.getCost()) };
                    writer.writeNext(str2);
                    writer.flush();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Thank you!");
        }
        sc.close();
    }

}
