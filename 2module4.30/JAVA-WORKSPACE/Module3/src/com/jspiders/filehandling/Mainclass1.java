package com.jspiders.filehandling;

import java.io.File;

public class Mainclass1 {
	public static void main(String[] args) {
		File ref = new File("C:\\Users\\rahul\\OneDrive\\Desktop\\jspiders\\jspiders_training/FILEIO");
		boolean bool = ref.exists();
		if (bool == false) {
			ref.mkdir();
			System.out.println("Folder Created");
        } else {
			System.err.println("Alert: File/Folder Exists");
		}

	}
}
