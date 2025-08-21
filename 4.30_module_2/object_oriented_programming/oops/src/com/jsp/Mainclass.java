package com.jsp;

class Alpha{
   static char p='r';
   static boolean q=false;
   static void help() {
	   System.out.println("execting  alpha help()");
   }
   static void read() {
	   System.out.println("execting alpha read()");
   }
   
}
public class Mainclass {
		
		public static void main(String[] args) {
			
			System.out.println(Alpha.p);
			Alpha.help();
			System.out.println(Alpha.q);
			Alpha.read();
		}

	}



