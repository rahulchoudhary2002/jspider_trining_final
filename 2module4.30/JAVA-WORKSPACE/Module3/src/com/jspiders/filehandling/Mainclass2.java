package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;
//Create File
public class Mainclass2 {
	public static void main(String[] args) {
		File ref = new File("C:\\Users\\rahul\\OneDrive\\Desktop\\jspiders\\jspiders_training/FILEIO/Demo.txt");
		boolean bool = ref.exists();
		if (bool == false) {
			try {
				ref.createNewFile();
				System.out.println("File Created");
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
        } else {
			System.err.println("File Already Exists");
		}

	}
}
