package com.corejava.clinic_logfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.opencsv.CSVWriter;

public class HandleRecord {
    public static void main(String[] args) throws IOException {
        Date dt = new Date();

        ArrayList<Clinic> clist = new ArrayList<>();
        ArrayList<Records> rlist = new ArrayList<>();
        clist.add(new Clinic(dt, "IND", "General", 5, "INDG"));

        rlist.add(new Records("INDG1", "INGSTRDVBC021579", 5.24, 9.25, 84.21, 4.21, 6.35, 5.21, 20));
        rlist.add(new Records("INDG2", "JKGBGIUD35468152", 8.24, 5.25, 58.21, 3.21, 3.35, 6.51, 65));
        rlist.add(new Records("INDG3", "EVKIIOHN53168138", 6.24, 4.25, 97.21, 4.83, 9.37, 8.23, 45));
        rlist.add(new Records("INDG4", "UYGUHBTDGJ351687", 3.24, 7.25, 32.21, 5.45, 2.45, 3.78, 18));
        rlist.add(new Records("INDG5", "RJNTDVTD61764684", 2.24, 3.25, 14.21, 1.91, 7.33, 7.91, 38));

        // clist.add(new Clinic(dt, "UK", "Private", 3, "UKP"));
        // rlist.add(new Records("UKP1", "JHVGHVBK35168", 5.21, 8.21, 6.54, 1.02, 5.21,
        // 6.32, 30));
        // rlist.add(new Records("UKP2", "OIYYJBMV51351", 3.21, 9.21, 7.54, 6.02, 7.21,
        // 4.32, 56));
        // rlist.add(new Records("UKP3", "QGFDCJYFJ1532", 4.21, 8.42, 1.54, 1.45, 3.21,
        // 9.32, 24));

        Scanner sc = new Scanner(System.in);
        getClinic(clist, rlist);
        System.out.println("1.GetClinic Records 2.Check Records 3.Exit");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Enter clinic Seq.Number: ");
                String seq = sc.next();
                getClinicRecords(rlist, seq);
                System.out.println(seq);
                break;
            case 2:
                checkRecords(rlist, clist);
                break;
            case 3:
                System.out.close();
                break;
            default:
                System.out.println("Invalid Option!");
        }
        sc.close();
    }

    public static void getClinic(List<Clinic> clilist, List<Records> relist) throws IOException {

        FileWriter fw = new FileWriter("clinic.txt");

        for (int i = 0; i < clilist.size(); i++) {
            Clinic c = clilist.get(i);
            fw.write(c.getDate() + "*" + c.getRegion() + "**" + c.getCtype() + "***" + c.getNorec() + "*********"
                    + c.getSeq() + System.lineSeparator());

        }

        for (int j = 0; j < relist.size(); j++) {
            Records r = relist.get(j);
            fw.write(r.getId() + "****" + r.getRef() + "******" + r.getChl() + "******" + r.getLcd() + "*******"
                    + r.getLipid() + "*******" + r.getOpd() + "********" + r.getPcs() + "**********" + r.getSgt()
                    + "***********" + r.getAge() + System.lineSeparator());
        }
        fw.close();

        File fr = new File("clinic.txt");
        BufferedReader br = new BufferedReader(new FileReader(fr));

        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();
    }

    public static void getClinicRecords(List<Records> reclist, String sno) {
        reclist.stream().filter(r -> r.getId().startsWith(sno)).collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void checkRecords(List<Records> relist, List<Clinic> cllist) throws IOException {
        Scanner se = new Scanner(System.in);
        int rno = 0;
        int count = 0;
        System.out.println("Enter the Clinic Seq Number:");
        String seq3 = se.next();
        for (int i = 0; i < cllist.size(); i++) {
            Clinic c = cllist.get(i);
            if (c.getSeq().equalsIgnoreCase(seq3)) {
                rno += c.getNorec();
            }
        }

        for (int j = 0; j < relist.size(); j++) {
            Records r = relist.get(j);
            if (r.getId().startsWith(seq3.toLowerCase()) || r.getId().startsWith(seq3.toUpperCase())) {
                count += 1;
            }
        }
        if (rno == count) {
            for (int k = 0; k < relist.size(); k++) {
                Records r1 = relist.get(k);
                if (r1.getChl() > 0 && r1.getAge() > 0 && r1.getLcd() > 0 && r1.getLipid() > 0 && r1.getOpd() > 0
                        && r1.getPcs() > 0 && r1.getRef() != null && r1.getSgt() > 0) {
                    System.out.println("Checked");
                } else {
                    System.out.println("Record Incomplete!");
                }
            }
        }
        System.out.println("Whant to convert to CSV: (y/n)");
        String ch = se.next();
        if (ch.equalsIgnoreCase("y")) {
            CSVWriter writer = new CSVWriter(new FileWriter("Clinic.csv"));
            for (int i = 0; i < cllist.size(); i++) {
                Clinic c = cllist.get(i);
                String[] str = { c.getDate().toString(), c.getRegion(), c.getCtype(), String.valueOf(c.getNorec()),
                        c.getSeq() };
                writer.writeNext(str);
                writer.flush();
            }
            for (int j = 0; j < relist.size(); j++) {
                Records r = relist.get(j);
                String[] str2 = { r.getId(), r.getRef(), String.valueOf(r.getAge()), String.valueOf(r.getChl()),
                        String.valueOf(r.getLcd()), String.valueOf(r.getLipid()), String.valueOf(r.getOpd()),
                        String.valueOf(r.getPcs()), String.valueOf(r.getSgt()) };
                writer.writeNext(str2); 
                writer.flush();
            }
        }
    }

}
