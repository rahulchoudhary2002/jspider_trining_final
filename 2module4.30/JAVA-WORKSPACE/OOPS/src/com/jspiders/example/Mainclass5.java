package com.jspiders.example;
class Account
{
	void withdraw()
	{
		System.out.println("withdraw from account");
	}
	void deposit()
	{
		System.out.println("deposite to account");
	}
}
class Customer
{
	Account a =new Account();
	//customer HAS-A Account:composition
}
class Bank
{
	Customer cu;
	//Bank HAS-A customer : Aggregation
	Bank(Customer cu){
		this.cu=cu;
	}
}
public class Mainclass5 {
     public static void main(String[] args) {
		Customer cu =new Customer();
		Bank icici=new Bank(cu);
		icici.cu.a.withdraw();
		Bank sbi=new Bank(cu);
		sbi.cu.a.deposit();
	}
}
