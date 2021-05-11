package com.corejava.generics_fruits;

import java.util.Map;


public class AppleCategory {
	public Map<Integer,Apple> addAppleCategory(Map<Integer, Apple> ha){
		return ha;	
	}
	public void getdetails(Map<Integer,? extends Apple> ha) {
		
		System.out.println(ha);
	}

}
