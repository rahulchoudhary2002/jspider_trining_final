package com.jspiders.typeconversion;

public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pongal p=new Pongal();
		Zomato.orderFood(p);
		
		Dosa d = new Dosa();
		Zomato.orderFood(d);
		
		Idly i = new Idly();
		Zomato.orderFood(i);
		
		Burger b= new Burger();
		Zomato.orderFood(b);
		
		
		Water w =new Water();
		Zomato.orderFood(w);
	}

}
