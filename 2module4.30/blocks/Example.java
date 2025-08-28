class Example{
	int a;
	double b;
	char c;
	
	{
		a=10;
		b=2.3;
		c='a';
	}
	public static void main(String[] args)
	{
		Example obj = new Example();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}