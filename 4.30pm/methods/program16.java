class program16
{
	static int square(int n)
	{
		int sq=n*n;
		return sq;
	}
	public static void main(String[] args)
	{
		for (int a=1; a<=5; a++)
		{
			System.out.println(a+" square : " +square(a));
		}
	}
}