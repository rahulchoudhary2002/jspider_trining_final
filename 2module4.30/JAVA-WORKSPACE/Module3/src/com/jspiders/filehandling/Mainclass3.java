package com.jspiders.filehandling;

import java.io.File;
//delete the file
public class Mainclass3 {
	public static void main(String[] args) {
		File ref = new File("C:\\Users\\rahul\\OneDrive\\Desktop\\jspiders\\jspiders_training/","FILEIO");
		boolean bool = ref.exists();
		if (bool == true) {
			ref.delete();
			System.out.println("Deleted completed");
          } else {
			System.err.println("File/Already already deleted ");
		}

	}
}
