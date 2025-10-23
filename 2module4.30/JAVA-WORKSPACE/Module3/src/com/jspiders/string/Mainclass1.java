package com.jspiders.string;

//string class object are comparable
public class Mainclass1 {
	public static void main(String[] args) {
		String str="chennai";
		
		System.out.println(str.compareTo("chennai"));//0
		
		System.out.println(str.compareTo("delhi"));//-1
		
		System.out.println(str.compareTo("bangalore"));//+1
		
		
	}
}
