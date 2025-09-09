package com.jspiders.typeconversion;
class Alpha
{
	void play()
	{
		System.out.println("execting play()");
	}
}
class Beta extends Alpha
{
	void send()
	{
		System.out.println("executing send()");
	}
	
}

public class exampleupcasting {

	public static void main(String[] args) {
	
		Beta ref=new Beta();
		ref.play();
		ref.send();
		
		Alpha obj=ref;	
		obj.play();    //upcasting : Beta -->Alpha
	//	obj.send();	it is not possible 
		//CTE:->	after upcasting we cannot access sub-class properties..
	}

}
