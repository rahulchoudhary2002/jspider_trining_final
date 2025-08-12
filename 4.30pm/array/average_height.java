class average_height
{
	public static void main(String[] args)
	{  
		double[] arr={5.11,5.10,5.11,5.7,5.8};
		    double sum=0;
			for (int i=0; i<arr.length; i++)
			{
				sum=sum+arr[i];
				
			}
		    double average =sum/arr.length;
			System.out.println("Sum of the arr is: "+average);
	}
}