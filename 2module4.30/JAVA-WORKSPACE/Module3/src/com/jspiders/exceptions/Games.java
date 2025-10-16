package com.jspiders.exceptions;

public class Games {
	int hiScore=0;
	static void createCopy() throws CloneNotSupportedException{
	Games original=new Games();
	original.hiScore=5000;
	
	Games copy=(Games)original.clone();
	System.out.println(copy.hiScore);
	}
	public static void main(String[] args) {
		try {
			createCopy();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("clone failed");
		}
	}

}
