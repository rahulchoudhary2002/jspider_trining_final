package org.oopsconcept;
class Account{
	long accNum;
	double accBal;
	
	void widhdraw( double amt) {
		accBal=accBal-amt;
		System.out.println("widhdraw from account : " +accNum+ " balance : "+accBal );
	}
	void deposite(double amt) {
		accBal=accBal+amt;
		System.out.println("deposite to account : "+accNum+" balance " +accBal);
	}
}
public class mainclass1 {
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.accNum=23048292l;
		a1.accBal=25000;
		a1.widhdraw(500.0);
		a1.deposite(500);
		
		Account a2=new Account();
		a2.accNum=274822923;
		a2.accBal=10000;
		a2.widhdraw(1000);
	}

}
