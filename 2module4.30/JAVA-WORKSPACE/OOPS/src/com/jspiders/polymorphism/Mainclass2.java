package com.jspiders.polymorphism;

class Irctc
{
	void search(int trainNo)
	{
	System.out.println("Train Details");	
	}
	void search(String src, String dec)
	{
		System.out.println("Route Details");
	}
	void search(long pnr)
	{
		System.out.println("Tickets Details");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
  Irctc ref=new Irctc();
		
		ref.search(36373);
		ref.search("kota","jaipur");
		ref.search(393939334L);
		

	}

}
