package org.oopsconcept;
class Player{
	String name = "kohali";
}
public class Mainclass5 {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		System.out.println(p1.name);
		System.out.println(p2.name);
		p1.name="rohit";
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}
