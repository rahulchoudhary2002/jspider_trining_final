package org.jspidersPawanSirmodule2;
class NeonNumbers{
	static boolean neonNumbers(int n){
		int prod=n*n;
		int sum=0;
		while (prod>0) {
		int r=prod%10;
		sum = sum+r;
		prod=prod/10;
		
		}
		if (sum==n)
			return true;
		else
			return false;
		
		
	}

 

	public static void main(String[] args) {
		int n= 9;
		System.out.println(neonNumbers(n));
		
	}

}
