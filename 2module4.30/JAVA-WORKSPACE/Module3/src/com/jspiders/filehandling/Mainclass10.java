package com.jspiders.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mainclass10 {
	public static void main(String[] args) {
		BufferedReader ref=null;
		try {
			ref=new BufferedReader(new FileReader("C:\\Users\\rahul\\OneDrive\\Desktop\\jspiders\\jspiders_training\\FILEIO\\Demo.txt") );
			String str= ref.readLine();
			while(str!=null)
			{
				System.out.println(str);
				str=ref.readLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
				System.out.println("file closed");
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
