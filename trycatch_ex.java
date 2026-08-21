public class trycatch_ex
{
	public static void main(String args[])
	{
		int i=50;
		int j=0;
		int data;
		try
		{
			data=i/j;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Error handled by calculating="+(i/(j+2)));
	}
}