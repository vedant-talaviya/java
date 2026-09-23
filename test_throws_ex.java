class test_throws_ex
{
	static int dividenum(int m,int n) throws ArithmeticException
	{
		int div=m/n;
		return div;
	}
	public static void main(String[] args)
	{
		try
		{
			System.out.println(dividenum(41,0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n Number cannot be divided by zero");
		}
		System.out.println("Rest of the code");
	}
}