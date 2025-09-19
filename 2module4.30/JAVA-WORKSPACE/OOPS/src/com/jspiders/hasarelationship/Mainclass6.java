package com.jspiders.hasarelationship;
class Printer
{
	void print(String str)
	{
		System.out.println(str);
	}
	void print(int arg)
	{
		System.out.println(arg);
	}
	void print(double arg)
	{
		System.out.println(arg);
	}
}
class Computer
{
	static Printer out =new Printer();
}
public class Mainclass6 {
	public static void main(String[] args) {
		
		Computer.out.print("Hello");

		Computer.out.print(10);
		
		Computer.out.print(4.5);
	}
}
