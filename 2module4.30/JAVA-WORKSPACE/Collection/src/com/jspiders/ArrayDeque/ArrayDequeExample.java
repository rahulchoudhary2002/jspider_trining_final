package com.jspiders.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		a.offer(23);
		a.offer(25);
		a.offer(34);
		a.offer(10);
		a.offer("Black");
		a.offer(true);
//		a.offer(null);
		
		a.peekFirst();
		a.peekLast();
		
		a.addFirst(77);
		a.addLast(77);
		System.out.println(a);
	}

	

	
}
