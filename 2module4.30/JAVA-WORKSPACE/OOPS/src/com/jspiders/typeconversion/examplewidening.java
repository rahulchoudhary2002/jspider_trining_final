package com.jspiders.typeconversion;

class Demo
{
	void play(float val)
	{
		System.out.println("value : "+val);
	}
}

public class examplewidening {

	public static void main(String[] args) {
		
		Demo ref = new Demo();
		ref.play(4.5f);
		ref.play('a');
		ref.play(2);

	}

}
