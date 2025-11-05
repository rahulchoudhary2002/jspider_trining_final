package com.jspiders.list;
import java.util.ArrayList;



public class insertion {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(34);
		al.add("hi");
		al.add(null);
		al.add(true);
		al.add(34);
		System.out.println(al);
		al.add(2,200);
		System.out.println(al);
		al.add(10);
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		ArrayList al1=new ArrayList();
		al1.add(61);
		al1.add("blue");
		System.out.println(al1);
		
		al1.addAll(al);
		System.out.println(al1);
		System.out.println(al);
		
	}
		
	
		
	
}
