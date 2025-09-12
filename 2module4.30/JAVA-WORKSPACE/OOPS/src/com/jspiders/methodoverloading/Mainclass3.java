package com.jspiders.methodoverloading;

class Example
{
	void eat(int a, String s)
	{
		System.out.println("veg food");
	}
	void eat(String s, int a)
	{
		System.out.println("non-veg food");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
	
		Example ex = new Example();
		ex.eat(10, "hello");
		ex.eat("hello", 100);

	}

}
