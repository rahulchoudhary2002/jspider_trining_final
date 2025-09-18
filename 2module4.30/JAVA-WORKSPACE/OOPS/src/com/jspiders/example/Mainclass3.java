package com.jspiders.example;
class Engine
{
	void power()
	{
		System.out.println("engine sends power");
	}
}
class Driver
{
	void drive()
	{
		System.out.println("driver is driving");
	}
}
class Car
{
	Engine eng=new Engine();
	Driver dr;
	Car(Driver dr){
		this.dr=dr;
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		Driver dr=new Driver();//car HAS-A Engine: Composition
		Car c=new Car(dr);//car HAS-A Driver:Aggregation
		c.eng.power();
		c.dr.drive();
	}
}
