package com.jspiders.inheritance;

class InstagramOld
{
	void post(){
		System.out.println("Posting the photo");
	}
}

class InstagramNew extends InstagramOld
{
	void messenger(){
		System.out.println("Message service");
	}
}



public class Mainclass4 {
public static void main(String[] args) {
	
	InstagramNew ref=new InstagramNew();
	ref.post();
	ref.messenger();
  }
}
