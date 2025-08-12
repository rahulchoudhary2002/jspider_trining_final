import java.util.Scanner;

class array1{
	public static void main(String[] args)
	{
		int A[]={2,4,6,7,8,10};
			
			//here A.lenght define the lengh of the array in this program
				for (int i=0; i<A.length;i++)
				{
					System.out.println(A[i]);
				}
				
				//In this program the array in the  reverse order 
				for (int i=A.length-1; i>=0;i--)
				{
					System.out.println("reverse of the numbers " +A[i]);
				}
				/*for (int x:A)
				{
					System.out.println(x);
				}
				*/
	}
} 