package com.jspiders.polymorphism;
class Launcher
{
	void open(int a)
	{
		System.out.println("Google chrome");	
	}
	void open(double d) 
	{
		System.out.println("Firebox");
	}
	void open(String s)
	{
		System.out.println("Edge");
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Launcher obj =new Launcher();
		obj.open(55);
		obj.open(5.5);
		obj.open("ab");
	}
	

}
