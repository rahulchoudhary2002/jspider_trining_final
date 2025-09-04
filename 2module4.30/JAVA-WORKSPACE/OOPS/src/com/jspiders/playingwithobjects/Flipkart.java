package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Flipkart {
	
	static void showProductDetails(Product p)
	{
		if(p!=null)
		{
			System.out.println("enter the pid :"+p.pid);
			System.out.println("enter the price :"+p.price);
		}
	}
		
		static Product createProduct()
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("enter the pid");
			int pid=scn.nextInt();
			System.out.println("enter the price");
			double price =scn.nextDouble();
			
			Product p = new Product(pid,price);
			
			return p;
			
		}
}
