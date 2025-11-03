package com.jspiders.threadexamples;

public class Mainclass5 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		try {
			Thread.sleep(3000);
	}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("program ends");
	}
}
