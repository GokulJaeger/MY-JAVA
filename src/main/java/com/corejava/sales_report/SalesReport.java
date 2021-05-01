package com.corejava.sales_report;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesReport {
    static float sgst = (float) 0.06;
    static float cgst = (float) 0.06;
    static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) throws IOException {

        ArrayList<Goods> glist = new ArrayList<>();
        glist.add(new Goods("PA001", "Rice", "Grocery", "1-Kg Pack", 5, -100));
        glist.add(new Goods("PA002", "D", "Grocery", "1-Kg Pack", 3, 215));
        glist.add(new Goods("PA003", "Shampoo", "Health Care", "150-ml Pack", 2, 240));
        glist.add(new Goods("PA004", "M", "Dairy", "1-l Pack", 2, 70));
        glist.add(new Goods("PA005", "Dettol", "Kitchen Care", "150-ml Pack", 2, 110));
        glist.add(new Goods("PA006", "KitKat", "Dairy", "50-g Pack", 2, 90));
        glist.add(new Goods("PA007", "Sweet Bread", "Baked", "1 Pack", 2, 40));
        glist.add(new Goods("PA008", "Lion Dates", "Fruits", "250-g Pack", 1, -115));

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1: List Products 2: Get Bill 3: Exit");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    listProduct(glist);
                    break;
                case 2:
                    checkDetails(glist);
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Input no corresponding operation, please re-enter");
            }
        }
    }

    public static void listProduct(ArrayList<Goods> gli) throws IOException {
        System.out.println("\t\t\t\tGoods List\t\t\t\t");
        System.out.println("Id\tName\t\tCategory\tDescription\tCount\tPrice");
        for (int i = 0; i < gli.size(); i++) {
            Goods gs = gli.get(i);
            System.out.println(gs.getId() + "\t" + gs.getName() + "\t\t" + gs.getCategory() + "\t\t"
                    + gs.getDescription() + "\t" + gs.getCount() + "\t" + gs.getPrice());
        }
    }

    public static void getBill(ArrayList<Goods> gl) {

        System.out.println("\t\t\tEmart\t\t\t");
        System.out.println("\t\t123 Avenue, Crompet\t\t\n");
        System.out.println("\t\tBill Report\n");
        System.out.println("Id\tName\t\tCategory\tDescription\tCount\tPrice\n");
        for (int i = 0; i < gl.size(); i++) {
            Goods g = gl.get(i);
            System.out.println(g.getId() + "\t" + g.getName() + "\t\t" + g.getCategory() + "\t\t" + g.getDescription()
                    + "\t" + g.getCount() + "\t" + g.getPrice());
        }
        float tot = (float) 0.00;
        float sg = (float) 0.06;
        float cg = (float) 0.06;
        float gtot = (float) 0.00;
        for (int i = 0; i < gl.size(); i++) {
            Goods g = gl.get(i);
            tot += g.getPrice();
        }
        sg *= tot;
        cg *= tot;
        gtot = sg + cg + tot;

        System.out.println("Total:\t" + String.format("%.2f", tot));
        System.out.println("S GST:\t" + String.format("%.2f", sg));
        System.out.println("C GST:\t" + String.format("%.2f", cg));
        System.out.println("Grand Total:\t" + String.format("%.2f", gtot));
    }

    public static void checkDetails(ArrayList<Goods> chlist) {

        ArrayList<Goods> elist = new ArrayList<>();
        for (int i = chlist.size() - 1; i >= 0; i--) {
            Goods cg = chlist.get(i);
            if (cg.getPrice() < 0) {
                System.out.println("Product Price Invalid" + cg.getPrice());
                elist.add(cg);
                chlist.remove(i);
            } else if (cg.getName().length() < 2) {
                System.out.println("Invalid producat Name:" + cg.getName());
                elist.add(cg);
                chlist.remove(i);
            }
            System.out.println(i);
        }
        getBill(chlist);
        System.out.println("\n\nInvalida Products:");
        for (int i = 0; i < elist.size(); i++) {
            Goods g = elist.get(i);
            System.out.println(g.getId() + "\t" + g.getName() + "\t\t" + g.getCategory() + "\t\t" + g.getDescription()
                    + "\t" + g.getCount() + "\t" + g.getPrice());
        }

    }
}
