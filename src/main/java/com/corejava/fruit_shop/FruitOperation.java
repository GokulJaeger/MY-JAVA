package com.corejava.fruit_shop;

import java.util.ArrayList;

public class FruitOperation {
	void getDetails(ArrayList<Fruits> al )
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
	void findByDis(ArrayList<Fruits> al,String distName)
	{
		System.out.println("Search Completed");
		for(Fruits f:al)
		{
			if(f.dis.equals(distName))
			{
				System.out.println(f);
			}
		}
	}
	void findByName(ArrayList<Fruits> al,String name )
	{
		System.out.println("Searched");
		for(Fruits f1:al)
		{
			if(f1.fname.equals(name))
			{
				System.out.println(f1);
			}
		}
	}
	void findByloc(ArrayList<Fruits> al,String location)
	{
		System.out.println("Searched");
		for(Fruits f2:al)
		{
			if(f2.location.equals(location))
			{
				System.out.println(f2);
			}
		}
	}
}
