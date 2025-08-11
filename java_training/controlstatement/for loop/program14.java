class program14
{
	public static void main(String[] args)
	{
		int n=5;
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++){
				if (    i==0 || j==0 || i==n-1 || j==n-1 || i==j || i+j==n-1  )
				{
					System.out.print("*" + " ");
				}
				
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();	
		}			
	}
}
/*
* * * * *
* *   * *
*   *   *
* *   * *
* * * * *



int n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				
	            if(i%2==0 || j%2==0)      //if(j%2==0)
				{
					System.out.print("*"+ " ");
				}else
				{
				System.out.print(0+ " ");	
				}
			}
			System.out.println();
		}
		*/