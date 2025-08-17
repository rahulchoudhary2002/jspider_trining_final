class string_concept
{
	public static void main(String[] args)
	{
		String str="Jspiders";
		String str1="rahulchoudhary19";
		//charAt() return the character at the specific index from the current string.
		System.out.println(str.charAt(3));
		
		//length
		
		System.out.println(str.length());
		
		//toCharArray
		char[] ch=str1.toCharArray();
		
		for (int i=0; i<ch.length;i++)
		{
			System.out.println(ch[i]);
			
		}
		
		//indexOf
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('r'));
		
		//contains() 
		//startsWith()
		//endsWith()
		
		String str2 ="Enginerring";
		System.out.println(str2.contains("gin"));
		System.out.println(str2.contains("Egin"));
		System.out.println(str2.startsWith("Eng"));
		System.out.println(str2.endsWith("ings"));
		
		
		//equals()
		System.out.println(str2.equals("Enginerring"));
		System.out.println(str2.equalsIgnoreCase("Enginerring"));
		   
		   
		//toUpperCase   
		//toLowerCase   
		System.out.println(str2.toUpperCase());
		    
			
	//substring
			System.out.println(str.substring(4));
			System.out.println(str.substring(4,8));
			
	//trim()

		
	
		
	//split()
			
			String str4="Jspiders qspiders pispiders";
		String[] arr =str4.split(" ");
		for (int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
		
		
		
		
	}
}

/*class stringQuestion
{
	public static void main(String[] args)
	{
		//toUpperCase() method and toLowerCase() method is explain here
		String str = "java_SE24";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//
		System.out.println(str.equals("java_SE24"));
		System.out.println(str.equalsIgnoreCase("java_SE241"));
	}
}

/*JAVA_SE24
java_se24
true
false*/