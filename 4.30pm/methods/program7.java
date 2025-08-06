class program7
{	
	static void help(char ch)
	{
		System.out.println(ch);
	}
	static void connect(boolean bool)
	{
		System.out.println("value recevid : " +bool);
	}
	public static void main(String[] args)
	{
		help('a');
		connect(false);
	}
}