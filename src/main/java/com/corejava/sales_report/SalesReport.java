package com.corejava.sales_report;

import java.io.IOException;
import java.util.ArrayList;
// import java.util.Iterator;
import java.util.Scanner;
// import java.util.Set;

public class SalesReport {
    static float sgst = (float) 0.06;
    static float cgst = (float) 0.06;

    public static void main(String[] args) throws IOException {

        ArrayList<Goods> glist = new ArrayList<>();
        glist.add(new Goods("PA001", "Rice", "Grocery", "1-Kg Pack", 5, 100));
        glist.add(new Goods("PA002", "Dhal", "Grocery", "1-Kg Pack", 3, 215));
        glist.add(new Goods("PA003", "Shampoo", "Health Care", "150-ml Pack", 2, 240));
        glist.add(new Goods("PA004", "Milk", "Dairy", "1-l Pack", 2, 70));
        glist.add(new Goods("PA005", "Dettol", "Kitchen Care", "150-ml Pack", 2, 110));

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1: List Products 2: Get Bill 3: Exit");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    listProduct(glist);
                    break;
                case 2:
                    getBill(glist);
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

        if (checkDetails(gl) == true) {
            System.out.println("\t\t\tEmart\t\t\t");
            System.out.println("\t\t123 Avenue, Crompet\t\t\n");
            System.out.println("\t\tBill Report\n");
            System.out.println("Id\tName\t\tCategory\tDescription\tCount\tPrice\n");
            for (int i = 0; i < gl.size(); i++) {
                Goods g = gl.get(i);
                System.out.println(g.getId() + "\t" + g.getName() + "\t\t" + g.getCategory() + "\t\t"
                        + g.getDescription() + "\t" + g.getCount() + "\t" + g.getPrice());
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

            System.out.println("Total:\t" + tot);
            System.out.println("S GST:\t" + sg);
            System.out.println("C GST:\t" + gtot);
        } else {

        }
    }

    public static boolean checkDetails(ArrayList<Goods> chlist) {

        for (int i = 0; i < chlist.size(); i++) {
            Goods cg = chlist.get(i);
            if(cg.get)
        }

        return true;

    }
}

// import java.util.ArrayList;
// import java.util.Scanner;

// class Goods {
// private String id;
// private String name;
// private double price;
// private String unit;
// private int count;

// public Goods() {
// }

// public Goods(String id, String name, double price, String unit) {
// this.id = id;
// this.name = name;
// this.price = price;
// this.unit = unit;
// }

// public String getId() {
// return id;
// }

// public void setId(String id) {
// this.id = id;
// }

// public String getName() {
// return name;
// }

// public void setName(String name) {
// this.name = name;
// }

// public double getPrice() {
// return price;
// }

// public void setPrice(double price) {
// this.price = price;
// }

// public String getUnit() {
// return unit;
// }

// public void setUnit(String unit) {
// this.unit = unit;
// }

// public int getCount() {
// return count;
// }

// public void setCount(int count) {
// this.count = count;
// }

// }

// public class SalesReport extends Basemodel
// {

// public static void main(String[] args)
// {
// ArrayList<Goods> list = new ArrayList<>();
// list.add(new Goods("001", "Rice", 15.5, "jin"));
// list.add(new Goods("002", "Sugar", 14.5, "package"));
// list.add(new Goods("003", "Dal", 145.0, "A"));
// list.add(new Goods("004", "Salt", 19.0, "G"));
// list.add(new Goods("005", "Thyme", 179.0, "h"));
// Scanner sc = new Scanner(System.in);

// while (true) {
// System.out.println("\t \t \t \t \t \t E-Mart");
// System.out.println(" \t \t \t \t \t 123 Avenue CA District ");
// System.out.println(" enter what you want to do:");
// System.out.println("1: product list 2: receipt 3: Exit");
// int num = sc.nextInt();
// switch (num) {
// case 1:
// showAllGoods(list);
// break;
// case 2:
// payAndShow(list);
// break;
// case 3:
// System.out.println("Thank you");
// System.exit(0);
// default:
// System.out.println("Input no corresponding operation, please re-enter");
// }
// }

// }

// public static void showAllGoods(ArrayList<Goods> list)
// {
// System.out.println("\t \t \t \t \t \t E-Mart");
// System.out.println(" \t \t \t \t \t 123 Avenue CA District ");
// System.out.println("---------------------------");
// System.out.println("Product List\n");
// System.out.println("Commodity id\t\t name\t\t unit price");
// for (int i = 0; i < list.size(); i++) {
// Goods g = list.get(i);
// System.out.println(g.getId() + "\t\t\t" + g.getName() + "\t\t" + g.getPrice()
// );
// }
// System.out.println("---------------------------");
// System.out.println("enter items purchased (input format: product id-purchase
// quantity)");
// Scanner sc = new Scanner(System.in);

// while (true) {
// String line = sc.nextLine();
// String[] good = line.split("-");

// if ("end".equals(line)) {
// System.out.println("End of Purchase");
// break;
// }
// if (good.length != 2) {
// System.out.println("The purchase posture you entered is incorrect, please
// change the posture and try again (format: product id-purchase quantity)");
// continue;
// }
// if (!isIdExist(list, good[0])) {
// System.out.println("The product id you entered does not exist, please enter
// it again!");
// continue;
// }
// addGoods(list, good[0], Integer.valueOf(good[1]));
// }
// }

// public static boolean isIdExist(ArrayList<Goods> list, String id) {
// for (int i = 0; i < list.size(); i++) {
// Goods g = list.get(i);
// if (g.getId().equals(id)) {
// return true;
// }
// }
// return false;
// }

// public static void addGoods(ArrayList<Goods> list, String id, int count) {
// for (int i = 0; i < list.size(); i++) {
// Goods g = list.get(i);
// if (g.getId().equals(id)) {
// int oldCount = g.getCount();
// g.setCount(oldCount + count);
// return;
// }
// }
// }

// public static void payAndShow(ArrayList<Goods> list) {
// System.out.println("\t \t \t \t \t \t E-Mart");
// System.out.println(" \t \t \t \t \t 123 Avenue CA District ");
// System.out.println("---------------------------");
// System.out.println(" Sales Report ");
// System.out.println("Name\t price\t quantity\t amount");
// int type = 0;
// int all = 0;
// double allMoney = 0.0;
// for (int i = 0; i < list.size(); i++) {
// Goods g = list.get(i);
// int count = g.getCount();
// if (count != 0) {
// type++;
// all += count;
// double price = g.getPrice();
// double money = price * count;
// allMoney += money;
// System.out.println(g.getName() + "\t" + price + "\t\t" + count + "\t" +
// money);
// }
// }
// System.out.println("---------------------------");
// System.out.println(type + "Items");
// System.out.println("total:" + all + "Piece");
// System.out.println("Total:" + allMoney);
// System.out.println("---------------------------");

// for (int i = 0; i < list.size(); i++) {
// list.get(i).setCount(0);
// }

// }

// }