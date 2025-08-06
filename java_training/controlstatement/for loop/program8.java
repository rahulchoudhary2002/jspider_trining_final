

				

class program8
{
	public static void main(String[] args)
	{
		int n=5;//control the size of square
		int val = 1;
		for (int i=0; i<n; i++)//no. of rows
		{
			for(int j=0; j<n; j++)//no. of colums
			{
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
			val=1;
		}
	}
}
/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/