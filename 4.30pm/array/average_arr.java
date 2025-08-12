class average_arr
{
	public static void main(String[] args)
	{  
		int[] arr={14,13,11,16,12};
		    int sum=0;
			for (int i=0; i<arr.length; i++)
			{
				sum=sum+arr[i];
				
			}
		    int average =sum/arr.length;
			System.out.println("Sum of the arr is: "+average);
	}
}