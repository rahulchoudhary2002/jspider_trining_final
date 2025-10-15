package com.jspiders.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Mainclass5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter value");
		try {
			int val=scn.nextInt();
			System.out.println("value : "+val);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
		finally {
			scn.close();
			System.out.println("Scanner closed");
		}
	}

}
