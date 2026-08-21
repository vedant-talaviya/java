public class finally_block
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Inside try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block always executes");
		}
		System.out.println("rest of the code");
	}
}