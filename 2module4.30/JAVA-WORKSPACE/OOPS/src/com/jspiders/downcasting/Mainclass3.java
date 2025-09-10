package com.jspiders.downcasting;
class Delta{
	int x=100;
}
class Example extends Delta{
	int y= 200;
}
public class Mainclass3 {

	public static void main(String[] args) {
	
		Delta d = new Example();
		System.out.println(d.x);
		
		System.out.println("================================");
		
		Example e = (Example)d;
		
		System.out.println(e.x);
		System.out.println(e.y);
		
	}

}
