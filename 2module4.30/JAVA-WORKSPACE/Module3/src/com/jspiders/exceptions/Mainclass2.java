package com.jspiders.exceptions;

public class Mainclass2 {
	public static void main(String[] args) {
		String str="java";
		
		try 
		{
			System.out.println(str.charAt(7));
			
		}
		catch(NullPointerException e)
		{
			System.out.println("alert: operation with null");
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("alert : invalid index");
		}
	}
}
