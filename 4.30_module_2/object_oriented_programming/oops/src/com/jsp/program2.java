package com.jsp;

class Sample{
   static int a=100;
   static double b=8.9;
   static void play() {
	   System.out.println("execting play()");
   }
   static void disp() {
	   System.out.println("execting disp()");
   }
   
}
public class program2 {
		
		public static void main(String[] args) {
			
			System.out.println(Sample.a);
			Sample.play();
			System.out.println(Sample.b);
			Sample.disp();
		}

	}



