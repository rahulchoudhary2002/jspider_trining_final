package com.jspiders.polymorphism;
class Flipkart
{
	void payment()
	{
		System.out.println("cod");
	}
	void payment(long card)
	{
		System.out.println("card : 10% discount");
	}
	void payment(String upi)
	{
		System.out.println("UPi : 50 rs cashback");
	}
	
}
public class Mainclass {

	public static void main(String[] args) {
		Flipkart ref =new Flipkart();
		ref.payment();
		ref.payment(4384384837438l);
		ref.payment("GPAY");
	}

}
