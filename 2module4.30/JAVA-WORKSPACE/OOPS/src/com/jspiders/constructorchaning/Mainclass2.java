package com.jspiders.constructorchaning;
class Amazon {
	Amazon(){
		System.out.println("Initialize Shopping");
	}
	Amazon(double supsciption){
		System.out.println("Ininitialize music");
		System.out.println("Inintialize video");
	}
}

public class Mainclass2 {

	public static void main(String[] args) {
		Amazon regular=new Amazon();
		System.out.println("===========================");
		Amazon prime =new Amazon(1299.0);
		

	}

}
