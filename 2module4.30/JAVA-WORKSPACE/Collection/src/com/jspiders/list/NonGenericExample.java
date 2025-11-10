package com.jspiders.list;

import java.util.ArrayList;

public class NonGenericExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("a");
		al.add(null);
		al.add(true);
		al.add('b');
		al.add(65);
		System.out.println(al);
		for(Object o:al) {
			System.out.println(o);
		}
	}

}
