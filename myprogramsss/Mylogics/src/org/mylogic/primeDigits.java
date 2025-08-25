//sum of the number then check the number is prime or not

package org.mylogic;

public class primeDigits
{
	static int number(int n) 
	 {
	
		while(n>0) {
			int rem=n%10;
			if (prime(rem))
				System.out.println(prime(rem));
			 n=n/10;
			
			
		}
		return 0;
	}
	static boolean prime(int n) {
		if (n<=1)
			return false;
		for (int i=2; i<n/2;i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2322;
		System.out.println(number(num));
		
//		int sum=sum(num);
//		if (prime(sum))
//		System.out.println(prime(sum));
	
	
	
	}

}
