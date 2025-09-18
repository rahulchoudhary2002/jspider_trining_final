package com.jspiders.example;
class Camera
{
	void photo()
	{
		System.out.println("Camera for photo");
	}
}
class SimCard
{
	void services()
	{
		System.out.println("SimCard is jio/airtel");
	}
}
class Mobile
{
	Camera cam=new Camera();
	SimCard sim;
	Mobile(SimCard sim){
		this.sim=sim;
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		SimCard airtel=new SimCard();//composition
		SimCard jio=new SimCard();//aggreation
		Mobile mob=new Mobile(jio);
		
		mob.cam.photo();
		mob.sim.services();
	
	}
}
