package com.jspiders.methodoverloading;

class Irctc
{
	void search(int trainNo)
	{
	System.out.println("serach with train number");	
	}
	void search(String src, String dec)
	{
		System.out.println("search with source & decitination");
	}
	void search(long pnr)
	{
		System.out.println("search with PNR");
	}
}
public class Mainclass6 {

	public static void main(String[] args) {
	
		Irctc tk=new Irctc();
		
		tk.search(36373);
		tk.search("kota","jaipur");
		tk.search(393939334L);
	}

}
