package com.jspiders.methodoverriding;
class Facebookold
{
	void reaction() {
		System.out.println("like");
	}
}
class Facebooknew extends Facebookold
{
	@Override
	void reaction() {
		System.out.println("like,wow,sad,angrey,haha,love");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		
		Facebookold fb =new Facebooknew();
		fb.reaction();
		
		

	}

}
