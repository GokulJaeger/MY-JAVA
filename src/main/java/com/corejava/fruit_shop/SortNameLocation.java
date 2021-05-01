package com.corejava.fruit_shop;

import java.util.Comparator;

public class SortNameLocation implements Comparator<Grocery> {

	@Override
	public int compare(Grocery o1, Grocery o2) {
		if(o1.gname.compareTo(o2.gname)==0)
		{
			return o1.location.compareTo(o2.location);
		}
		else
		{
			return o1.gname.compareTo(o2.gname);
		}
	}

		
	}


