package com.jspiders.exceptions;

public class Game {
	int hiScore=0;
	public static void main(String[] args) {
		Game ref=new Game();
		ref.hiScore = 5000;

		try {
			Game copy = (Game) ref.clone();
			System.out.println(copy.hiScore);
		} catch (CloneNotSupportedException e) {
			System.out.println("clone operation faild");

		}

	}
}
 