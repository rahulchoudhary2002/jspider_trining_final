package com.jspiders.methodoverloading;

class Sample
{
	void test(int a)
	{
		System.out.println("white box Testing");
	}
	void test(int a , int b)
	{
		System.out.println("black box Testing");
	}
	void test(int a , int b, int c)
	{
		System.out.println("grey box Testing");
	}
}
public class Mianclass2 {
	public static void main(String[] args) {
		
		Sample obj= new Sample();
		obj.test(12);
		obj.test(12, 14);
		obj.test(12,14,14);
	}

}
