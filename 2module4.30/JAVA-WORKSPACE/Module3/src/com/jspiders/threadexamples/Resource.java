package com.jspiders.threadexamples;

public class Resource {
	static void play() {
		for (int a = 1; a <= 5; a++) {
			Thread th = Thread.currentThread();
			System.out.println(a+"Thread nmae : "+th.getName());
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	static void  help() {
		for(int a=10; a<15;a++) {
			Thread th =Thread.currentThread();
			System.out.println(a+"Thread name : "+th.getName());
			try {
				Thread.sleep(500);
		}
			catch(InterruptedException e) {
				e.printStackTrace();
				}
			}
	}

}
