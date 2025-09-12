package com.jspiders.methodoverloading;

class Flipkart
{
	void payment()
	{
		System.out.println("COD");
	}
	void payment(long card)
	{
		System.out.println("CARD");
	}
	void payment(String upi)
	{
		System.out.println("UPI");
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		
		Flipkart fl = new Flipkart();
		fl.payment();
		fl.payment(383839321);
		fl.payment("rahuldfeh323");
		

	}

}
