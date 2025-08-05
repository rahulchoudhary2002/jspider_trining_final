class program5
{	
	static void test()
	{
		
		System.out.println("test start");
		System.out.println("test ends");
		
	}
	static void disp()
	{
		System.out.println("disp start");
		test();
		System.out.println("disp ends");
	}
	


	public static void main(String[] args)
	{
		System.out.println("main start");
		disp();
		System.out.println("main ends");
	}
}