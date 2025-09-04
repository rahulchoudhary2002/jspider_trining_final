package com.jspiders.playingwithobjects;

import java.util.Scanner;

public class Rooster {
	
	static void displayPlayerDetails(Player p)
	{
		if(p!=null)
		{
			System.out.println("jersey Number :" +p.jerseyNumber);
			System.out.println("name :"+p.name);
		}
	}
	static Player createlPlayer()
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("enter jersey number");
		int jerseyNumber=scn.nextInt();
		System.out.println("enter the name");
		String name=scn.next();
		Player p = new Player(jerseyNumber,name);
		return p;
	}

}
