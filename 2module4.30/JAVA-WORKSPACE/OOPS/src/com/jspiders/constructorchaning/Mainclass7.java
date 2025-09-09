package com.jspiders.constructorchaning;
class Parent
  {
	Parent()
	{	
		
		System.out.println("aaaa");
	}
	Parent(int x)
	{
		this();
		System.out.println("bbbb");
	}
  
}
class Child extends Parent
{
	Child()
	{
		super(10);
		System.out.println("cccc");
	}
	Child(int y)
	{	
		super(10);
		System.out.println("ddddd");
	}
}
public class Mainclass7 {

	public static void main(String[] args) {
		
		
		Child c=new Child();
	}

}
