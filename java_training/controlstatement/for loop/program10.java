

				

class program10
{
	public static void main(String[] args)
	{
		int n=5;//control the size of square
		int val = 5;
		for (int i=0; i<n; i++)//no. of rows
		{
			for(int j=0; j<n; j++)//no. of colums
			{
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
			val=5;
		}
	}
}

/*5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/