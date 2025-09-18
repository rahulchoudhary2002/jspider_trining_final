package com.jspiders.polymorphism;

public class Mainclass4 {
	public static void main(String[] args) {
		FrontEnd fe=new FrontEnd();
		Lead.reviewWork(fe);
		
		BackEnd be=new BackEnd();
		Lead.reviewWork(be);
		
	}
}
