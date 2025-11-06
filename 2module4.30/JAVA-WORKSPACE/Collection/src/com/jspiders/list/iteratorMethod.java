package com.jspiders.list;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorMethod {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);

		Iterator i = al.iterator();

//		System.out.println(i.hashCode());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());

		while (i.hasNext()) {
			System.out.println(i.hasNext());
			System.out.println(i.next());

		}

	}
}
