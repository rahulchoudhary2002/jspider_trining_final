package com.jspiders.list;

import java.util.ArrayList;

public class Remove2 {
	public static void main(String[] args) {
		ArrayList bag1=new ArrayList();
		
		bag1.add("apple");
		bag1.add("mango");
		bag1.add("graps");
		
		ArrayList bag2=new ArrayList();
		
		bag2.add("jackFruit");
		bag2.add("banana");
		bag2.add("mango");
		bag2.add("graps");
		
		System.out.println(bag1); 
//		
////		bag1.removeAll(bag2);
//		
//		System.out.println(bag1);
//		System.out.println(bag2);
		
		bag1.retainAll(bag2);
		
		System.out.println(bag1);
		System.out.println(bag2);
		
		
	}
}
