class stringp1
{
	public static void main(String[] args)
	{
		String str= "Engineering";
		/*
		
		//contains()       startsWith()        endsWith()
		
		System.out.println("contains()");
		
		System.out.println("contains()");
		System.out.println(str.contains("job"));
		System.out.println(str.contains("gin"));
	
		System.out.println(str.startsWith("gin"));
		System.out.println(str.startsWith("Eng"));
		
		System.out.println(str.endsWith("ing"));
		System.out.println(str.endsWith("Eng"));
		
		// equals()              equalsIgnoreCase()
		
		System.out.println(str.equals("java"));
		System.out.println(str.equals("Engineering"));
		
		System.out.println(str.equalsIgnoreCase("java"));
		System.out.println(str.equalsIgnoreCase("Engineering"));*/
		
		
		// toUpperCase()======toLowerCase()
		
		
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//subString()
		
			
			System.out.println(str.substring(4));
			
			System.out.println(str.substring(10));
			System.out.println(str.substring(2,3));
			
			String str1 ="      java     program     ";
			System.out.println("-->"+str1.trim()+"<--");
			System.out.println("-->"+str1+"<--");
		
		
		
		String str2 ="qspiders jspiders pyspiders prespiders";
		String[] arr = str2.split(" ");
		
		for (int i=0; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}
}