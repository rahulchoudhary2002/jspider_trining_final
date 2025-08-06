

				

class program9
{
	public static void main(String[] args)
	{
		int n=5;//control the size of square
		char val = 'a';
		for (int i=0; i<n; i++)//no. of rows
		{
			for(int j=0; j<n; j++)//no. of colums
			{
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
			val='a';
		}
	}
}
/*
a b c d e
a b c d e
a b c d e
a b c d e
a b c d e
*/