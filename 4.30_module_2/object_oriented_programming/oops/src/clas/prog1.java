package clas;
class Player
{
	String name;
	int jerseyNumber;
	void play()
	{
		System.out.println(name+" is name and jersey number is "+jerseyNumber);
	}
}
public class prog1 {
	public static void main(String[] args)
	{
	
		Player p1 = new Player();
		p1.name="rohit sharma";
		p1.jerseyNumber=45;
		p1.play();
		
		Player p2 = new Player();
		p2.name="virat";
		p2.jerseyNumber=18;
		p2.play();
		
		Player p3 = new Player();
		p3.name="rahul";
		p3.jerseyNumber=8;
		p3.play();
		
	}
}
