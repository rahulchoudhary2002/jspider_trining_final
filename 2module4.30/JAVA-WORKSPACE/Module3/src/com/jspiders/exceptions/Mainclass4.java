package com.jspiders.exceptions;

public class Mainclass4 {
	public static void main(String[] args) {
		try {
			System.out.println("try-starts");
			System.out.println(10/2);
			System.out.println("try-ends");
		}catch(ArithmeticException e)
		{
			System.out.println("/by zero");
		}
		finally {
			System.out.println("executing finally block");
		}
	}
}
