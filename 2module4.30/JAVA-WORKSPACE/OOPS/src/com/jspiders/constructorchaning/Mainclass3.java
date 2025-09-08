package com.jspiders.constructorchaning;

class Student
{
	Student()
	{
		System.out.println("Initialize Personal Details");
		System.out.println("Initialize Academic Details");
		
	}
	Student(boolean exp){
		this();
		System.out.println("Initialize Experiance Details");
	
	}
	
}
public class Mainclass3 {

	public static void main(String[] args) {
		Student fresher=new Student();
		System.out.println("========================================");
		Student experiance=new Student(true);

	}

}
