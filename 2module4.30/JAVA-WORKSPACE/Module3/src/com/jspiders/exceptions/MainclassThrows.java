package com.jspiders.exceptions;
class Demo
{
	void test() {
		System.out.println("executing test()........");
	}
}
public class MainclassThrows {
	static void instantiate() throws ClassNotFoundException,IllegalAccessException,InstantiationException
	{
		Demo ref=(Demo)Class.forName("com.jspiders.exceptions.Demo").newInstance();
				ref.test();
	}
	public static void main(String[] args) {
		try {
			instantiate();
		}
		catch(ClassNotFoundException|IllegalAccessException|Instantiation)
		System.out.println(e.getClass());
	}
}
