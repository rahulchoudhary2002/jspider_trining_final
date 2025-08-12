import java.util.Scanner;
class displayNumber{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = scn.nextInt();
		
		int r;
		int count=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			System.out.println(r);
			count++;
		}
		System.out.println("enter the number of digits"+count);
	}
}