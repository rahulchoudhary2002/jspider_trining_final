package com.jspiders.typeconversion;

public class Mainclass1 {

	public static void main(String[] args) {
		
		
		Mobile mob=new Mobile();
		Flipkart.addToKart(mob);//AUTO-CASTING :	Mobile-->Product
		
		Television tv =new Television();
		Flipkart.addToKart(tv);	//AUTO-CASTING :	Television-->Product
		
		Refrigerator ref =new Refrigerator();
		Flipkart.addToKart(ref);	//AUTO-CASTING :	Refrigerator-->Product
		
		
		

	}

}
