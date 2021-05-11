package com.corejava.generics_fruits;

import java.util.Comparator;

public class Sort implements Comparator<Apple>{

	public int compare(Apple o1, Apple o2) {
		
		return o1.values[3].compareTo(o2.values[3]);
	}

}
