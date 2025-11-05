package com.jspiders.list;

import java.util.ArrayList;
public class Remove_operation {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("black");
		al.add("blue");
		al.add("white");
		al.add("red");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		al.remove("black");
		System.out.println(al);

	}

}
