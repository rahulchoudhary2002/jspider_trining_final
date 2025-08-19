package com.jsp;
class vendor
{
String str="string";
int id =1212;
	void test()
	{
		System.out.println("execting the test()");
	}
	void supply()
	{
		System.out.println("execting the supply()");
	}
	
}

public class mainclass4 {
	public static void main(String[] args) {
		vendor ex= new vendor();
		
		
		System.out.println(ex.str);
		System.out.println(ex.id);
		ex.test();
		ex.supply();
		
	}

}
