class Demo{
	int val=100;
	void test(){
		System.out.println("executing test ");
	}
}
public class Mainclass{
	public static void main(String[] args){
		Demo d= new Demo();
		System.out.println(d.val);
		d.test();
	}
}