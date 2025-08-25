//sum of the number then check the number is prime or not

package org.mylogic;

public class primeNumber 
{
	static int sum(int n) 
	 {
		int s=0;
		while(n>0) {
			int rem=n%10;
			 s=s+rem;
			 n=n/10;
			
		}
		return s;
	}
	static boolean prime(int n) {
//		if (n<=1)this is for numbers between 1 to 100
//			return false;
		for (int i=2; i<n/2;i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=98;
		System.out.println(sum(num));
		
		int sum=sum(num);
		if (prime(sum))
		System.out.println(prime(sum));
	
	
	
	}

}
