class array5
{
	public static void main(String[] args)
	{  /*
		int[] arr={14,13,11,16,12};
		    int sum=0;
			for (int i=0; i<arr.length; i++)
			{
				sum=sum+arr[i];
			}
			System.out.println("Sum of the arr is: " +sum);*/
			
			
			int[] arr={14,13,11,16,12};
			int sum=0;
			for (int i=0; i<arr.length; i++)
			{
				if (arr[i]%2==0){
					sum=sum+arr[i];
				}
				
			}System.out.println("Sum of the arr is: " +sum);
	}
}