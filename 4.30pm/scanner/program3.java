import java.util.Scanner;
class program3
{
	public static void main (String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number1");
		double num1 =scn.nextDouble();
		
		System.out.println("enter the number2");
		double num2 =scn.nextDouble();
		
		double result=num1+num2;
		System.out.println("addition of numbers" +result);
	
	}
}