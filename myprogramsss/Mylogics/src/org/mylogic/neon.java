package org.mylogic;
//check this number is neon or not neon number
public class neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=9;
			int sq;
			sq=num* num;
			System.out.println(sq);
			int sum=0;
			while (sq>0) {
				int rem=sq%10;
				sum=sum+rem;
				sq=sq/10;
				
			}
			if(num==sum)
				System.out.println("this number is neon number : " +num);
			else
				System.out.println("this number is not neon number : " +num);
			
	}

}
