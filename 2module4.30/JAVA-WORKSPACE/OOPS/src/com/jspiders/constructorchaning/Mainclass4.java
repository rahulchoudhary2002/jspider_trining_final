package com.jspiders.constructorchaning;
class Demo
{
	Demo(){
		System.out.println("Demo() Constructor");
	}
}
class Sample extends Demo
{
	Sample(){
		super();
		System.out.println("Sample() Constructor");
	}
	
}
public class Mainclass4 {

	public static void main(String[] args) {
		
		Sample ref=new Sample();

	}

}
//output
//Demo() Constructor
//Sample() Constructor
