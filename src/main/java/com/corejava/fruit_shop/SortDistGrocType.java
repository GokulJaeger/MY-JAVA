package com.corejava.fruit_shop;

import java.util.Comparator;

public class SortDistGrocType implements Comparator<Grocery> {

	@Override
	public int compare(Grocery o1, Grocery o2) {
		if(o1.distributor.compareTo(o2.distributor)==0)
		{
			return o1.gtype.compareTo(o2.gtype);
		}
		else
		{
			return o1.distributor.compareTo(o2.distributor);
		}
	}

}
