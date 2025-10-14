package com.jspiders.exceptions;

public class Mainclass1 {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		
		try
		{
			System.out.println(10/2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("/By zero");
		}
		
		System.out.println("Program ends");

	}

}
