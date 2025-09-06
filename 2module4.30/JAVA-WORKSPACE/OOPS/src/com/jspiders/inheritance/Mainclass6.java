package com.jspiders.inheritance;


class AdobeFree
{
	void read()
	{
		System.out.println("Reading the Document");
	}
}
class AdobePaid extends AdobeFree
{
	void edit()
	{
		System.out.println("Editing the pdf Documents");
	}
}



public class Mainclass6 {

	public static void main(String[] args) {
		
		AdobePaid obj =new AdobePaid();
		obj.read();
		obj.edit();

	}

}
