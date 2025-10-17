package com.jspiders.exceptions;
class OverSpeedException extends Exception 
{
	OverSpeedException(){
		
	}
	OverSpeedException(String msg){
		super(msg);
	}
}
class Police
{
		static void checkSpeed(int speed) throws OverSpeedException{
			if(speed>80) {
			throw new OverSpeedException("Overspeed fine added");
			}
		}
}

public class Mainclass8 {
	 public static void main(String[] args) {
		try {
			Police.checkSpeed(60);
			Police.checkSpeed(40);
			Police.checkSpeed(70);
			Police.checkSpeed(120);
	}
		catch(OverSpeedException e) {
			System.out.println(e.getMessage());
			}
		}
}
