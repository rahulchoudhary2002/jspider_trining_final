package com.jspiders.polymorphism;

public class Card {
	void swipe()
	{
		System.out.println("please wait");
	}
}
class DebitCard extends Card
{
	@Override
	void swipe() {
	System.out.println("balance reduces");
	}
}
class CreditCard extends Card
{
	@Override
	void swipe() {
		System.out.println("due increase");
	}
}