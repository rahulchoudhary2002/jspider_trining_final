package com.jspiders.list;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Priya",13);
		Student s2=new Student(2,"riya",14);
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(new Student(3,"Rahul",15));
		
		System.out.println(al);
	}

}
