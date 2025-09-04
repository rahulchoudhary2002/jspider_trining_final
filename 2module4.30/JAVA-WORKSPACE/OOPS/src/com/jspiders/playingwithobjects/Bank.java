package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Bank {
	static void showAccountInfo(Account a)
	{
		if(a!=null)
		{
			System.out.println("Account number :"+a.accountNumber);
			System.out.println("Account balance :"+a.accountBalance);
		}
		
	}
	static Account createAccount()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the account number");
		long accountNumber=scn.nextLong();
		System.out.println("enter the balane");
		double accountBalance=scn.nextDouble();
		
		Account a = new Account (accountNumber , accountBalance);
		return a;
	}
}
