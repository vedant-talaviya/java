class college
{
	void display()
	{
		class student
		{
			void show()
			{
				System.out.println(student);
			}
		}
		student s=new student();
		s.show();
	}
	public static void main(String[] args)
	{
		college c=new college();
		c.display();
	}
}