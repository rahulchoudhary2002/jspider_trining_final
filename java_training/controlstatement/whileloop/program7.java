class program7
{
	public static void main(String[] args)
	{
		int num=12;
		int a=1;
		int sum=0;
		
		while(a <= num/2)
		{
			if (num%a==0)
			{
				sum=sum+a;
			}
			a++;
		}
		System.out.println("sum : " +sum);
		if (sum==num)
		{
			System.out.println("this is the perfect number");
		}else {
			System.out.println("this is not a perfect number");
		}
	}
}

/* sum : 16 
this is check for perfect or not perfect */
