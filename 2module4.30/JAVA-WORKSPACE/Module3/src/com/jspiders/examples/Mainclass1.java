package com.jspiders.examples;
class Student1
{
	String name="Rama";
}
class Student2{
	String name="Rama";
	@Override
	public String toString() {
		return "Student Name: "+name;
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Student1 obj=new Student1();
		System.out.println(obj);
		Student2 ref=new Student2();
		System.out.println(ref);
	}
}
