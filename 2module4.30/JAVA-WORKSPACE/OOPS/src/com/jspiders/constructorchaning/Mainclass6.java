package com.jspiders.constructorchaning;
class Delta
{
	Delta()
	{
		System.out.println("Delta() Constructor");
	}
	Delta(int a)
	{
		System.out.println("Delta(int) Constructor");
	}
	
}
class Example extends Delta
{
		Example(){
			super(10);
			System.out.println("Exapmle() constructor");
		}
	
}
public class Mainclass6 {

	public static void main(String[] args) {
		Example ex= new Example();

	}

}
