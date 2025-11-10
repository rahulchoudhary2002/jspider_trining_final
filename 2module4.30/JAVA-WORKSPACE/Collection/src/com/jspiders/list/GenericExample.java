package com.jspiders.list;

import java.util.ArrayList;

public class GenericExample {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		for(Integer i:al) {
			System.out.println(i);
		}
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		System.out.println(al1);
		for(String j:al1) {
			System.out.println(j);
		}
		
	}
}
