class program3
{
	static void read()
	{
		System.out.println("execting read");
	}
	static void write()
	{
		System.out.println("executing write");
	}
	static void edit()
	{
		System.out.println("execting edit");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method");
		edit();
		write();
		read();
	}
}