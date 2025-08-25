package org.mylogic;
//write a program to sum of the palindrome number between 1 to 1000;
public class palindrome {
	
	static int pali(int num) {
		
		int rev=0;
		while (num>0) {
			int rem=num%10;
			rev= rev*10 + rem;
			num = num/10;
			
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<1000; i++)	
		   {
			
			int rev= pali(i);
		
		
			
				if (i==rev)
				{	
				System.out.println(i);
				 sum=sum+i;
				}	
//				
//				
		   }
		 System.out.println(sum);
	}

}
