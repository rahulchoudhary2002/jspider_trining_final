import java.util.Scanner;
class program2
{
	public static void main (String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int num =scn.nextInt();
		
		if (num%2==0)
		{
			System.out.println("enter the number is even");
			
		}
		else
		{
			System.out.println("enter the number is odd");
		}
		
		
	
	}
}