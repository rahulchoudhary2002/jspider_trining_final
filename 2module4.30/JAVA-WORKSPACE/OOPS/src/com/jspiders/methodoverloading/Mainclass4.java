package com.jspiders.methodoverloading;

class Facebook
{
	void login(String un,String pwd)
	{
		System.out.println("Login with username and password");
	}
	void login(long mn,String pwd)
	{
		System.out.println("Login with mobile number and password");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		
		Facebook fb = new Facebook();
		
		fb.login("i3483hf", "dhfoeuy833");
		fb.login(23733388, "fieiuu342");
		

	}

}
