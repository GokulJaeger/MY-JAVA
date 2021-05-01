package com.corejava.fruit_shop;

import java.util.Collections;
import java.util.List;

public class GroceryOperations {
void getDetails(List<Grocery> fd )
{
	for(int i=0;i<fd.size();i++)
	{
		System.out.println(fd.get(i));
	}
}
void sortDistGroceryType(List<Grocery> fd)
{
	Collections.sort(fd,new SortDistGrocType());
	for(int i=0;i<fd.size();i++)
	{
		System.out.println(fd.get(i));
	}
}
void SortCostExpiry(List<Grocery> fd)
{
	Collections.sort(fd,new SortCostExpiry());
	for(int i=0;i<fd.size();i++)
	{
		System.out.println(fd.get(i));
	}
}
void findByDis(List<Grocery> fd,String distName)
{
	System.out.println("Searched");
	for(Grocery g:fd)
	{
		if(g.distributor.equals(distName))
		{
			System.out.println(g);
		}
	}
}
}

