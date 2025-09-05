package com.jspiders.inheritance;

class Demo {
	int val=100;
	void test()
	{
		System.out.println("executing test()");
	}
}
class Sample extends Demo
{
	
}
public class Mainclass1{
	public static void main(String[] args) {
		Sample ref=new Sample();
		System.out.println(ref.val);
		ref.test();
	}
}
