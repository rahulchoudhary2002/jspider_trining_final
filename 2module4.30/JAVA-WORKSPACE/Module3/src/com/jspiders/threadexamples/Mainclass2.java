package com.jspiders.threadexamples;
//By implementing runnable interface/]]
class SampleThread implements Runnable{
		@Override
		public void run() 
		{
			for(int a=1;a<=5;a++) {
				System.out.println("sample thread....");
			}
		}
}
public class Mainclass2 {
		public static void main(String[] args) {
			System.out.println("Program starts");
			SampleThread st=new SampleThread();
			Thread th =new Thread(st);
			th.start();
			for(int a=1;a<=5;a++) {
				System.out.println("main thread....");
			}
			System.out.println(" program ends");
			
		}
}
