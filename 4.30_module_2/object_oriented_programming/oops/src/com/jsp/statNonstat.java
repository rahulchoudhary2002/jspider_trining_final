package com.jsp;
	
class utility
{
	static int p=20;
	int q=14;
	static void test()
	{
		System.out.println("executing the test()");
	}
	void play()
	{
		System.out.println("executing the play()");
	}
	
}
public class statNonstat {
	public static void main(String[] args)
	{
		utility ref = new utility();
		System.out.println(utility.p);
		System.out.println(ref.q);
		utility.test();
		ref.play();
	}

}
