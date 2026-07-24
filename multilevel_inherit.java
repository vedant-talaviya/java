class person
{
	person()
	{
		System.out.println("Constructor of person class");
	}
}
class employee extends person
{
	employee()
	{
		System.out.println("Constructor of employee class");
	}
}
class md extends employee
{
	md()
	{
		System.out.println("Constructor of md class");
	}
}
class multilevel_inherit
{
	public static void main(String[] args)
	{
		md m=new md();
	}
}