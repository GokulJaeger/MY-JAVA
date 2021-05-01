package com.corejava.fruit_shop;

import java.util.Comparator;

public class SortCostExpiry implements Comparator<Grocery> {

	@Override
	public int compare(Grocery o1, Grocery o2) {
		if(o1.gtype.compareTo(o2.gtype)==0)
		{
			return o1.expDate.compareTo(o2.expDate);
		}
		return o1.expDate.compareTo(o2.expDate);
	}
		
}


