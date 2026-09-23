Class test_throw
{
	void checkNum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("\n Number is negative");
		}
		else
		{
			System.out.println("Number is positive");
		}
	}
	public static void main(String[] args)
	{
		test_throw obj=new test_throw();
		obj.checkNum(-1);
		System.out.println("Rest of the code");
	}
}