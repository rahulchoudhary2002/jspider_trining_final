package com.jspiders.filehandling;

import java.io.File;

public class Mainclass5 {
	public static void main(String[] args) {
		File ref = new File("C:\\Users\\rahul\\OneDrive\\Desktop\\jspiders\\jspiders_training/FILEIO");
		String [] arr= ref.list();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
}
