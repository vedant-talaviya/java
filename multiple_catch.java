class multiple_catch
{
	public static void main(String[] args)
	{
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs");
		}
		System.out.println("rest of code");
		System.out.println("rest of code");
		System.out.println("rest of code");

	}
}