package com.corejava.clinic_logfile;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HandleRecord {
    public static void main(String[] args) {

        loadData();

        Scanner sc = new Scanner(System.in);
    }

    public static void loadData(){
        Date dt = new Date();
        
        ArrayList<Clinic> clist = new ArrayList<>();
        clist.add(new Clinic(dt, "IND", "General", 5, "INDG"));
        clist.add(new Clinic(dt, "UK", "Private", 3, "UKP"));
        ArrayList<Records> rlist = new ArrayList<>();
        rlist.add(new Records("INDG1", "INGSTRDVBC021579", 5.24, 9.25, 84.21, 4.21, 6.35, 5.21, 20));
        rlist.add(new Records("INDG2", "JKGBGIUD35468152", 8.24, 5.25, 58.21, 3.21, 3.35, 6.51, 65));
        rlist.add(new Records("INDG3", "EVKIIOHN53168138", 6.24, 4.25, 97.21, 4.83, 9.37, 8.23, 45));
        rlist.add(new Records("INDG4", "UYGUHBTDGJ351687", 3.24, 7.25, 32.21, 5.45, 2.45, 3.78, 18));
        rlist.add(new Records("INDG5", "RJNTDVTD61764684", 2.24, 3.25, 14.21, 1.91, 7.33, 7.91, 38));
        rlist.add(new Records("UKP1", "JHVGHVBK35168", 5.21, 8.21, 6.54, 1.02, 5.21, 6.32, 30));
        rlist.add(new Records("UKP2", "OIYYJBMV51351", 3.21, 9.21, 7.54, 6.02, 7.21, 4.32, 56));
        rlist.add(new Records("UKP3", "QGFDCJYFJ1532", 4.21, 8.42, 1.54, 1.45, 3.21, 9.32, 24));
    }


}
