class car
{
	private String model="Toyota";
	class Engine
	{
		void show()
		{
		System.out.println(model);
		}
	}
}
class abc
{
	public static void main(String[] args)
	{
		car c=new car();
		car.Engine=c.new Engine();
		e.show();
	}
}