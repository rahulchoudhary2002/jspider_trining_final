package org.oopsconcept;
class Laptop
{
	String wallpaper="alia/jpeg";
}
public class Mainclass6 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		Laptop l2 = l1;
		System.out.println(l1.wallpaper);
		System.out.println(l2.wallpaper);
		l1.wallpaper="kiare.jpeg";
		System.out.println(l1.wallpaper);
		System.out.println(l2.wallpaper);
	}

}
