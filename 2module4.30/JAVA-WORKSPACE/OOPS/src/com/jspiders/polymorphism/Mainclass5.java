package com.jspiders.polymorphism;

public class Mainclass5 {

	public static void main(String[] args) {
		DebitCard dc =new DebitCard();
		Shop.payment(dc);
		
		CreditCard cc =new CreditCard();
		Shop.payment(cc);
		
		
	}

}
