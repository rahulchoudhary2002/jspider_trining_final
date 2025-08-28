class beta{
	
	static int val;
	//load all static members
	//execute all static initialization blocks
	static{
		System.out.println("executing static block1");
		val=50;
		
	}
	static{
		System.out.println("executing static block2");
		val=50;
	}
	public static void main(String[] args)
	{
		System.out.println("program start");
		System.out.println(beta.val);
		System.out.println("program ends");
	}
}