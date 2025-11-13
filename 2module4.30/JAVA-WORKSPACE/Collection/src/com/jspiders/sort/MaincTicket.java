package com.jspiders.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MaincTicket {
	public static void main(String[] args) {
		ArrayList<Ticket> al=new ArrayList<Ticket>();
		al.add(new Ticket(6373828,1500,"patna","gaya","13-nov-2025"));
		al.add(new Ticket(8373828,1800,"jaipur","delhi","23-nov-2025"));
		al.add(new Ticket(7373828,2000,"delhi","bangalore","28-nov-2025"));
		
		Collections.sort(al);
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

