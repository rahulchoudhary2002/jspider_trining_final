package com.jspiders.exceptions;

class HouseFullException extends Exception
{
	HouseFullException(){
		
	}
	HouseFullException(String msg){
			super(msg);
		}
}
class Theatre
{
	static int ticketsLeft=3;
	static void buyTickets() throws HouseFullException
	{
		if(ticketsLeft==0) {
			throw new HouseFullException("no tickets avalilble");
		}
		ticketsLeft--;
	}
}
public class Mainclass11 {

	public static void main(String[] args) {
		
		try {
			Theatre.buyTickets();
			Theatre.buyTickets();
			Theatre.buyTickets();
			Theatre.buyTickets();
		}
		catch(HouseFullException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
