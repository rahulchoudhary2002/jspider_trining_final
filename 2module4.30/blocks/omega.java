class omega{
	char val;
	
	
	{
		System.out.println("executing non-static initialization block");
		val ='A';
	}
	{
		System.out.println("executing non-static initialization block");
		val ='A';
	}
	public static void main (String[] args){
		
		System.out.println("program starts");
		omega o=new omega();
		System.out.println(o.val);
		System.out.println("program ends");
	}
	
}