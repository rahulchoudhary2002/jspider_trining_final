class stringQuestion1
{
	public static void main(String[] args)
	{    // trim() method is used by the programmer to eliminate the space from the beggining & ending from the string.
		String str= "      hello     engineer       ";
		System.out.println("---->"+str.trim()+"<----");
		
		//split() this method is used by the programmer to cut a large string into smaller string values.
	
		String str1= "qspiders jspiders pyspiders prespiders";
		String[] arr =str1.split(" ");
		for (int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
/*
---->hello     engineer<----
qspiders
jspiders
pyspiders
prespiders
*/