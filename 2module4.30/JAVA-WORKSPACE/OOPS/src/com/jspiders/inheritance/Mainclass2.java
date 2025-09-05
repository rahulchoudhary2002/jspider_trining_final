package com.jspiders.inheritance;

class Alpha
{
	void play()
	{
		System.out.println("executing the play()");
	}
}
class Beta extends Alpha
{
	void help()
	{
		System.out.println("executing the help()");
	}
}


public class Mainclass2 {
	public static void main(String[] args) {
		Alpha ref=new Alpha();
		ref.play();
		
		Beta obj=new Beta();
		obj.play();
		obj.help();
	}
}
