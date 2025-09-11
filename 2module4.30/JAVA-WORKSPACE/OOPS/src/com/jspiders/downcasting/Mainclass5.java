package com.jspiders.downcasting;

public class Mainclass5 {
	public static void main(String[] args) {
		
		Refrigerator ref = new Refrigerator();
		Flipkart.deliverProduct(ref);
		
		Television tv = new Television();
		Flipkart.deliverProduct(tv);
		
		Mobile mob = new Mobile();
		Flipkart.deliverProduct(mob);
	}
}
