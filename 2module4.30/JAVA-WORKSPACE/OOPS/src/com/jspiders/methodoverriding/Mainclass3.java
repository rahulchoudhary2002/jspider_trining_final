package com.jspiders.methodoverriding;
class Mother
{
	void marriage()
	{
		System.out.println("arrangle marriage");
	}
}
class Daughter extends Mother
{
	@Override
	void marriage()
	{
		System.out.println("love marraige");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother m=new Mother();
		m.marriage();
		
		Daughter d=new Daughter();
		d.marriage();
		
		Mother ref=new Daughter();
		ref.marriage();
		
	}

}
