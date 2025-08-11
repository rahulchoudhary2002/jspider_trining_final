import java.util.Scanner;
class program6
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		double n = scn.nextDouble();
		
		for (int i=0; i<n; i++)
		{
			for (int j=0;j<n;j++)
			{
				if (i==0|| j==0 || i==n-1 || j==n-1 ||  i==j || i+j==n-1)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
	}
}