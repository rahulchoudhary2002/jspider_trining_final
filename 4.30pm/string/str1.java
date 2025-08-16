
//charAt is used for print the specific letter  

class str1{
	public static void main(String[] args)
	{
		
		
		String str ="rahul choudhary rr";
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(16));
		//length method is used for finding the lenght of string
		System.out.println(str.length());
		/*toCharArray()
		tiger
			->String str="Tiger" 
			->char[] ch = str.toCharArray();*/
		

		//toCharArray() method is used
		String str1 = "tiger";
		char[] ch =str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		//indexOf() is used for searching the value .  

      System.out.println(str.indexOf('r'));
	  
	  int a= str.indexOf('a');
	  int b= str.indexOf('a',a+1);
	  System.out.println(str.indexOf('a'));	
      System.out.println(str.indexOf('b'));		

		
	}
}