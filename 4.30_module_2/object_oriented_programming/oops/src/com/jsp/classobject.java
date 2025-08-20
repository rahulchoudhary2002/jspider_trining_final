package com.jsp;
class Student
{
	String name;
	double cgpa;
	void study() {
		System.out.println(name+" is studing");
	}
	void write() {
		System.out.println(name+"is write");
	}
	
}
public class classobject {
	public static void main (String[] args) {
		Student s1 = new Student();
		s1.name ="krishna";
		s1.cgpa=9.3;
		s1.study();
		s1.write();
		System.out.println("---------------------------");
		Student s2 = new Student();
		s2.name ="rama";
		s2.cgpa=8.3;
		s2.study();
		s2.write();
		System.out.println("---------------------------");
	}
	

}
