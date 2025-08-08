class fact
{
	static int factorial( int n)
	{
		
		int f=1;
		while (n>=1)
		{
			f=f*n;
			n--;
	    
		}
		return f;
	}
	public static void main(String[] args)
	{
		for (int i=1; i<=5;i++)
		{
			System.out.println(i +" factorial : " +factorial(i));
		}
		
		
	}
}