package org.oopsconcept;
class Bike{
	String name;
	int price;
	
	void speed()
	{
		System.out.println("name of the bike "+name+" price is "+price);
	}
	
}
public class mainclass {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		
		b1.name="java";
		b1.price=300000;
		b1.speed();
	}
}
