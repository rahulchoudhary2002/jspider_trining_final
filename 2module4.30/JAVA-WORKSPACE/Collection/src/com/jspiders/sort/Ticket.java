package com.jspiders.sort;

public class Ticket implements Comparable {
	long pnr;
	Integer price;
	String from;
	String to;
	String date;

	public Ticket(long pnr, Integer price, String from, String to, String date) {
		super();
		this.pnr = pnr;
		this.price = price;
		this.from = from;
		this.to = to;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", price=" + price + ", from=" + from + ", to=" + to + ", date=" + date + "]";
	}

	@Override
	public int compareTo(Object o) {
		Ticket t = (Ticket) o;

		return -1 * this.price.compareTo(price);
	}

}
