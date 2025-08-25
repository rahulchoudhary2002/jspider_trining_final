class prime
{	

	static void prime(int num)
	{
		
		int a=1;
		int count=0;
		while(a<=num/2)
		{
			if (num%2==0)
			{
				count++;
			}
			a++;
		}
			if (count==1)
			{
				System.out.println("this is the prime number");
				
			}else
			{
				System.out.println("this is not a prime number");
			}
	}




	public static void main(String[] args)
	{
		prime(3);	
	
	}
	
}