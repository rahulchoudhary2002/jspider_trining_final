package com.jspiders.examples;
class Connection{
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Clear Cache Release Resource");
	}
}
public class Mainclass9 {

	public static void main(String[] args) {
		Connection con = new Connection();
		System.gc();
		con=null;
		System.gc();

	}

}
