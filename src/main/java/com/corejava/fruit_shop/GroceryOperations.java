package com.corejava.fruit_shop;

import java.util.Collections;
import java.util.List;

public class GroceryOperations {
	void getDetails(List<Grocery> fd) {
		System.out.println("Grocery Deatils:\n");
		for (int i = 0; i < fd.size(); i++) {
			System.out.println(fd.get(i));
		}
		System.out.println("========================================================================================");
	}

	void sortDistGroceryType(List<Grocery> fd) {
		Collections.sort(fd, new SortDistGrocType());
		System.out.println("Grocery Deatils:\n");
		for (int i = 0; i < fd.size(); i++) {
			System.out.println(fd.get(i));
		}
		System.out.println("========================================================================================");

	}

	void SortCostExpiry(List<Grocery> fd) {
		Collections.sort(fd, new SortCostExpiry());
		System.out.println("Grocery Deatils:\n");
		for (int i = 0; i < fd.size(); i++) {
			System.out.println(fd.get(i));
		}
		System.out.println("========================================================================================");

	}

	void findByDis(List<Grocery> fd, String distName) {
		System.out.println("Searched");
		System.out.println("Grocery Deatils:\n");
		for (Grocery g : fd) {
			if (g.distributor.equals(distName)) {
				System.out.println(g);
			}
		}
		System.out.println("========================================================================================");

	}
	// public static String formatAsTable(List<List<String>> rows)
	// {
	// int[] maxLengths = new int[rows.get(0).size()];
	// for (List<String> row : rows)
	// {
	// for (int i = 0; i < row.size(); i++)
	// {
	// maxLengths[i] = Math.max(maxLengths[i], row.get(i).length());
	// }
	// }

	// StringBuilder formatBuilder = new StringBuilder();
	// for (int maxLength : maxLengths)
	// {
	// formatBuilder.append("%-").append(maxLength + 2).append("s");
	// }
	// String format = formatBuilder.toString();

	// StringBuilder result = new StringBuilder();
	// for (List<String> row : rows)
	// {
	// result.append(String.format(format, row.toArray(new
	// String[0]))).append("\n");
	// }
	// return result.toString();
	// }
}
