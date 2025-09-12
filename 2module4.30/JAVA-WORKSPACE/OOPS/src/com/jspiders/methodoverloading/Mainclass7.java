package com.jspiders.methodoverloading;
class FingerPrint
{
	
}
class Mobile
{
	void unlock()
	{
		System.out.println("swipe to unlock");
	}
	void unlock(int pin)
	{
		System.out.println("pin to unlock");
	}
	void unlock(String pwd)
	{
		System.out.println("password to unlock");
	}
	void unlock(FingerPrint obj) {
		System.out.println("FingerPrint to unlock");
	}
}
public class Mainclass7 {
	public static void main(String[] args) {
		
		Mobile m= new Mobile();
		m.unlock();
		m.unlock(2322);
		m.unlock("338hhhe");
		
		m.unlock(new FingerPrint());
	}

}
