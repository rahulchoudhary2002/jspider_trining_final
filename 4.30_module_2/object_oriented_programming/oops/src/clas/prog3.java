package clas;
class Bike
{
	int cc;
	double milage;
	
	void drive()
	{
		System.out.println("Driving Bike with cc "+cc+" milage "+milage);
	}
}
public class prog3 {
	public static void main(String[] args)
	{
		Bike ktm = new Bike();
		ktm.cc=390;
		ktm.milage=14;
		ktm.drive();
		
		Bike re = new Bike();
		re.cc=650;
		re.milage=16;
		re.drive();
		
		Bike java = new Bike();
		java.cc=650;
		java.milage=16;
		java.drive();
	}

}
