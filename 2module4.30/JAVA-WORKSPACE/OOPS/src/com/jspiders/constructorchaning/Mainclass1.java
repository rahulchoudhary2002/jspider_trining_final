package com.jspiders.constructorchaning;
class City
{
	City(int a)
	{
		this(2.3);
		System.out.println("New York");
	}
	City(double d)
	{
		this("PQRS");
		System.out.println("LONDON");
	}
	City(String s)
	{
		System.out.println("PARISH");
	}
	
	
}
public class Mainclass1 {

	public static void main(String[] args) {
		City c=new City(25);

	}

}
