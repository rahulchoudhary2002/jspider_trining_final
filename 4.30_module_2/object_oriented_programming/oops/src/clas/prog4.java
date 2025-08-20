package clas;
class Bottle
{
	int capcity;
	
	void file() {
		System.out.println("capsity of the bottle is "+capcity);
	}
	void clean() {
		System.out.println("clean the bottle  "+capcity);
	}
}
public class prog4 {
	public static void main(String[] args) {
		Bottle b1 = new Bottle();
		b1.capcity=2;
		b1.file();
		b1.clean();
	}

}
