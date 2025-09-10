package com.jspiders.downcasting;
class Demo {

}
class Sample extends Demo{
	
}

public class Mainclass1 {
	public static void main(String[] args) {
		
		
		Demo ref =new Sample();
		Sample obj =(Sample)ref;//downcasting : Demo--> Sample
		System.out.println(ref);
		System.out.println(obj);
	}
}

//pre requirements 
//1. casting statement
//2. upcasting

