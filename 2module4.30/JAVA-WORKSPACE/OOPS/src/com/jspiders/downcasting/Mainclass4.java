package com.jspiders.downcasting;


public class Mainclass4 {

	public static void main(String[] args) {
		Developer dev = new Developer();
		Manager.workReview(dev);
		System.out.println("===========================");
		Tester qa=new Tester();
		Manager.workReview(qa);
		
	}

}
