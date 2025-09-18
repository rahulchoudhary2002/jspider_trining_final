package com.jspiders.example;
class Demo
{
void test()
    {
	System.out.println("executing the test()....");
    }
}
class Sample
{
	Demo d =new Demo();
}
public class Mainclass1 {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.d.test();
	}
}
