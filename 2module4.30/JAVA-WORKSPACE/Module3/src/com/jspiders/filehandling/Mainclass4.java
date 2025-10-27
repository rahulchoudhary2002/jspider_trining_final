package com.jspiders.filehandling;

import java.io.File;

class Example{
	static void showProperties(File obj) {
		System.out.println("Location : "+obj.getAbsolutePath());
		System.out.println("Length : "+obj.length());
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		File ref=new File("C:\\Users\\rahul\\OneDrive\\Desktop\\jspiders\\jspiders_training/FILEIO/Demo.txt");
		Example.showProperties(ref);
	}
}
