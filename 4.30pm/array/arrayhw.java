class arrayhw
{
	public static void main(String[] args)
	{
		int[] arr ={13,11,5,3,8,18};
		int sum=0;
		for (int i=1; i<arr.length-1; i++)
		{
			sum=sum + arr[i];
			
		}
		System.out.println("sum of the array except corners value : "+sum);
	}
}