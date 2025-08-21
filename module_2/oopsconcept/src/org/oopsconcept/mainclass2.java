package org.oopsconcept;
class LoginPage{
	String userName;
	String password;
	
	void login() {
		
		System.out.println("login success with username : " +userName+ "password : " +password);
	}
	void forgetPassword() {
		System.out.println("recovery link shared to email : "+userName);
	}
}
public class mainclass2 {
	public static void main(String[] args) {
		LoginPage l1 = new LoginPage();
		l1.userName ="ravi ";
		l1.password="ravi123";
		l1.login();
		System.out.println("===================================================");
		LoginPage l2 = new LoginPage();
		l2.userName="kumar";
		l2.forgetPassword();
	}
}
