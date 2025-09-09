package com.jspiders.typeconversion;

public class examplenarrowing {

	public static void main(String[] args) {
		double p = 4.5;
		int q = (int)p;		//narrowing : double --> int
		System.out.println(q);
		
		int x=68;
		char y=(char)x;		//narrowing : int -->char
		System.out.println(y);
		
		float i=3.7f;
		int j=(int)i;		//narrowing : float-->long
		System.out.println(j);
		

	}

}
