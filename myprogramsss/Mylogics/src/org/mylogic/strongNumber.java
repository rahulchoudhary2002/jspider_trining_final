package org.mylogic;
//check the number is strong or not;
public class strongNumber {
	static int strong(int n) {
	int temp= 0;
		while (n>0)
	{
		int rem=n%10;
		int fact=1;
		for (int i=1;i<=rem;i++)
		{
			fact=fact*i;
		
		}
		System.out.println(fact);	
		n=n/10;
//		
		temp=temp+fact;
	
		
		
	}
		return temp;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=144;
		
		int d=strong(number);
		System.out.println(number);
		
		if (number==d)
			System.out.println("this number is strong: "+d );
		else
			System.out.println("this number is not a  strong: "+number);
		
			
		
			
	
	}

}
