package com.jspiders.filehandling;

import java.io.File;

public class Mainclass11 {

	public static void main(String[] args) {
		File ref = new File("C:\\Users\\rahul\\OneDrive\\Desktop\\jspiders\\jspiders_training\\FILEIO\\obito.txt");
		boolean flag = ref.exists();
		if (flag == true) {
			System.out.println("Readable: " + ref.canRead());
			System.out.println("writeable : " + ref.canWrite());
			System.out.println("executable : " + ref.canExecute());
		}else {
			System.out.println("file not exist");
		}

	}

}
