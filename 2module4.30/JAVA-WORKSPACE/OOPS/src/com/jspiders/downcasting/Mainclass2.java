package com.jspiders.downcasting;

class Alpha {
	void play()
	{
		System.out.println("executing play()....");
	}
}
class Beta extends Alpha{
	void help() {
		System.out.println("executing help()....");
	}
}


public class Mainclass2 {

	public static void main(String[] args) {
		
		Alpha a= new Beta();
		a.play();
		
		Beta b = (Beta)a;
		System.out.println("=======================");
		b.play();
		b.help();
	}

}
