package com.jspiders.methodoverriding;
class Parent
{
	void watchTv() {
		System.out.println("news/serial");
	}
}
class child extends Parent
{
	@Override
	void watchTv() {
		System.out.println("movies/series");
	}
}


public class Mainclass1 {

	public static void main(String[] args) {
		
		Parent p= new Parent();
		p.watchTv();
		
		child c= new child();
		c.watchTv();
		
		Parent ref=new child();
		ref.watchTv();
	}

}
