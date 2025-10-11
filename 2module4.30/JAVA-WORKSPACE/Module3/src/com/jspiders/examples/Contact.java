package com.jspiders.examples;

public class Contact implements Cloneable{
	
	String cname;
	long number;
	public static void main(String[] args) throws CloneNotSupportedException {
		Contact original = new Contact();
		original.cname="jspiders";
		original.number=23874739343L;
		
		Contact copy =(Contact)original.clone();
		System.out.println(copy.cname);
		System.out.println(copy.number);
	}
}
