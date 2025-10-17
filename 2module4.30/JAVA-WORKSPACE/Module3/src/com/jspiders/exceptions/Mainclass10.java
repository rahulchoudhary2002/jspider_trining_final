package com.jspiders.exceptions;

class InvalidPinCodeException extends RuntimeException
{
	InvalidPinCodeException(){
		
	} 
	InvalidPinCodeException(String msg){
		super(msg);	
	}
	
}
class PinCodeVerifier
{
	static void verifyNumber(String mobile)
	{
		if(mobile.length()!=6) {
		throw new InvalidPinCodeException("Invalid Pincode");
		}
	}
}
public class Mainclass10 {
	public static void main(String[] args) {
		try {
			PinCodeVerifier.verifyNumber("9091282");
		}
		catch(InvalidPinCodeException e) {
			System.out.println(e.getMessage());
		}
	}
}
