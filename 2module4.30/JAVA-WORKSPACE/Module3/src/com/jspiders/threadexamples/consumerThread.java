package com.jspiders.threadexamples;

public class consumerThread implements Runnable {

	@Override
	public void run() {
		//class level lock on recourse
		Resource.play();
		Resource.help();
		
	}

}
