package com.jspiders.methodoverriding;
class Father
{
	void motorCycle() {
		System.out.println("normal");
	}
	
}
class Gunda extends Father{
	@Override
	void motorCycle() {
		System.out.println("abnormal");
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		
		Father ref=new Gunda();
		ref.motorCycle();
		

	}

}
