package clas;
class Mobile
{
	String model;
	double price;
	
	void call()
	{
		System.out.println("calling is to the model " +model);
	}
	void message()
	{
		System.out.println("message in "+model+" its price is "+price+"lakhs");
	}
}
public class prog2 {
	public static void main(String[] args)
	{
		Mobile m1 =new Mobile();
		m1.model="iphone 16 pro max";
		m1.price=1.5;
		m1.call();
		m1.message();
		
		Mobile m2 = new Mobile();
		m2.model="samsung s25 ultra max";
		m2.price=2.0;
		m2.call();
		m2.message();
	}

}
