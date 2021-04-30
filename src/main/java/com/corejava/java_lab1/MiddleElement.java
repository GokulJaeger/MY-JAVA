package com.corejava.java_lab1;

import java.util.LinkedList;

public class MiddleElement {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(2);
		ll.addFirst(3);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(8);
		ll.addLast(13);
		ll.addLast(18);
		System.out.println("LinkedList: " + ll);
		int middle = ll.get(ll.size() / 2);
		System.out.println("Middle Element: " + middle);
	}

}
