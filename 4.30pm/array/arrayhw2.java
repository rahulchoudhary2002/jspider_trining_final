class arrayhw2
{
	public static void main(String[] args)
	{
		int[] arr ={12,11,5,3,8,18};
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			if (i==0 || i==arr.length-1)
			sum=sum + arr[i];
			
		}
		System.out.println("sum of the array except corners value : "+sum);
	}
}