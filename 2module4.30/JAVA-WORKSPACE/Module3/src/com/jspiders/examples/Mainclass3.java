package com.jspiders.examples;
class Circle {
	int radius=10;
	@Override
	public boolean equals(Object obj) {
		Circle c= (Circle)obj;
		if(this.radius==c.radius) {
			return true;
			
		}
		else {
			return false;
		}
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Circle c1= new Circle();
		Circle c2= new Circle();
	}
}
