package com.jspiders.methodoverloading;

class Demo{
	void play(int a) {
		System.out.println("Pubg");
	}
	void play(double d) {
		System.out.println("Freefire");
		
	}
	void play(String s) {
		System.out.println("Ludo");
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		
		 Demo ref=new Demo();
		 ref.play(10);
		 ref.play(5.4);
		 ref.play("hello");
	}

}
