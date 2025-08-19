package com.jsp;
class Example
{
	int a =50;
	char b='j';
	void disp()
	{
		System.out.println("execting disp()");
	}
	void help()
	{
		System.out.println("execting help()");
	}
}

public class mainclass3 {
	public static void main(String[] args)
	{
	Example ex = new Example();
	System.out.println(ex.a);
	System.out.println(ex.b);
	ex.disp();
	ex.help();

   }
}
