package com.jspiders.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.offer(45);
		p.offer(23);
		p.offer(33);
		p.offer(44);
		p.offer(90);
//		p.offer("j");   //classCastException
//		p.offer(null); //nullPointerException
		System.out.println(p);
		
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
	}
}
