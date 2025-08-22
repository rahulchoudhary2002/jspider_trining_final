package org.oopsconcept;

	


public class mainclass4 {
		static boolean verify(int n)
		{
			
			if (n%2==0)
				     return true;
				else
					return false;
		}	
		public static void main(String[] args) {
			
			boolean num=verify(6);
			System.out.println(num);
		}
}
