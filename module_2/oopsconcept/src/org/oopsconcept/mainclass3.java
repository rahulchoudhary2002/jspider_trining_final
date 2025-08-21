package org.oopsconcept;
class Email{
	String from;
	String to;
	
	void compare() {
		System.out.println("write a mail to " +to+" hello");
	}
	void read() {
		System.out.println("recevied main from " +from+" hello ");
	}
}
public class mainclass3 {

	public static void main(String[] args) {
		Email p1 = new Email();
		p1.from="rahulchoudhary19march@gamil.com";
		p1.to="rohitchoudhary14may@gmail.com";
		p1.compare();
		p1.read();

	}

}
