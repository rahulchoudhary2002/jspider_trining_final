package com.jspiders.exceptions;

class InvalidMobileNumberException extends RuntimeException
{
	InvalidMobileNumberException(){
		
	} 
	InvalidMobileNumberException(String msg){
		super(msg);	
	}
	
}
class PhoneNumberVerifier
{
	static void verifyNumber(String mobile)
	{
		if(mobile.length()!=10) {
		throw new InvalidMobileNumberException("Invalid Number");
		}
	}
}
public class Mainclass9 {
	public static void main(String[] args) {
		try {
			PhoneNumberVerifier.verifyNumber("909012345");
		}
		catch(InvalidMobileNumberException e) {
			System.out.println(e.getMessage());
		}
	}
}
