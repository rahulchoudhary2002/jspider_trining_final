import java.util.Scanner;
class program5
{
	public static void main(String[] args)
	{
		/*Scanner scn = new Scanner(System.in);
		System.out.println("enter the numbers1 :");
		int number1=scn.nextInt();
	
		System.out.println("enter the number2 : ");
		int number2=scn.nextInt();
		
		int addition=number1 + number2;
		System.out.println("addition of the numbers is = " +addition);    */
		
		
		Scanner scn = new Scanner(System.in);
		int num= scn.nextInt();
		
		for (int i=0; i<=num; i++)
		{
			for (int j=0; j<=num; j++)
			{
				if (i==0 ||  j==0 || i+j==){
				System.out.print("*" + " ");
				}
				else
				{
				System.out.print(" " + " " );
				}
				
		     }
			 System.out.println();
		}
		
	}
	
}
