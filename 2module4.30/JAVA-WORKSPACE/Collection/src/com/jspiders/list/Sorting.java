package com.jspiders.list;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(80);
		al.add(38);
		al.add(63);
		al.add(32);

		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("a");
		al2.add("r");
		al2.add("f");
		al2.add("y");

		Collections.sort(al2);
		System.out.println(al2);

		Collections.sort(al2, Collections.reverseOrder());
		System.out.println(al2);

	}

}
