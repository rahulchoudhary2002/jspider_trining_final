package com.jspiders.polymorphism;

public class Developer {
	void work()
	{
		System.out.println("coding");
	}
}
class FrontEnd extends Developer
{
	@Override
	void work()
	{
		System.out.println("Html,Css,Js");
	}
	
}
class BackEnd extends Developer
{
	@Override
	void work()
	{
		System.out.println("Java, sql,spring");
	}
}
