package com.jspiders.threadexamples;

public class Mainclass7 {

	public static void main(String[] args) {
	Thread t1=new Thread (new consumerThread());
	t1.setName("tessarct");
	
	Thread t2=new Thread(new consumerThread());
	t2.setName("keyptonite");
	
	t1.start();
	t2.start();

	}

}
