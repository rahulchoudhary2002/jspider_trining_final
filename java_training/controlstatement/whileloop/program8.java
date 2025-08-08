class program8
{
	public static void main(String[] args)
	{
		int a=1;
		int num=10;
		int count=0;
		
		while(a<=num/2)
		{
			if (num%a==0)
			{
				count++;
			}
			a++;
		}
		System.out.println("count : " +count);
		
		if (count==1)
		{
			System.out.println("this is the prime number");
		}else {
			System.out.println("this is not a prime number");
		}
	}
}
