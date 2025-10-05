package com.jspiders.examples;

enum Bike{
	KTM,YAMAHA,ROYAL_ENFIELD,BAJAJ,HERO,TVS
}
public class Mainclass3 {

	public static void main(String[] args) {
		Bike b1=Bike.YAMAHA;
		System.out.println(b1);
		Bike b2=Bike.ROYAL_ENFIELD;
		System.out.println(b2);
		System.out.println("=================");
		Bike[] arr=Bike.values();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
