class twod_array
{
	public static void main (String args[])
	{
		int[][] marks= {{89,42,72},{90,91,72},{88,61,74}};
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(marks[i][j]+"");
			}
			System.out.println();
		}
	}
}