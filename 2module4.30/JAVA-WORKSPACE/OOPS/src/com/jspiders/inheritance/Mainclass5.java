package com.jspiders.inheritance;

class Whatsapp1
{
	void message() 
	{
		System.out.println("message in whatsapp");
	}
}

class Whastapp2 extends Whatsapp1
{
	void call()
	{
		System.out.println("call in whatsapp");
	}
}

class Whastapp3 extends Whastapp2
{
	void status()
	{
		System.out.println("status in whatsapp");
	}
}


public class Mainclass5 {

	public static void main(String[] args) {
		Whastapp3 obj=new Whastapp3();
		obj.message();
		obj.call();
		obj.status();

	}

}
