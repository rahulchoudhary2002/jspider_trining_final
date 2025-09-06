package com.jspiders.inheritance;

class SwiggyV1
{
	void foodDelivery()
	{
		System.out.println("Food delivery only");
	}
}
class SwiggyV2 extends SwiggyV1
{
	void groceryDelivery()
	{
		System.out.println("Grocery delivery");
	}
}



public class Mainclass7 {

	public static void main(String[] args) {
	
			SwiggyV2 ref = new SwiggyV2();
			ref.foodDelivery();
			ref.groceryDelivery();
		
	}

}
