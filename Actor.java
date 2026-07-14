class Actor
{
    String lastname;
	String firstname;
	Actor(String lastname,String firstname)
	{
	      this.lastname=lastname;
		  this.firstname=firstname;
	}
	public static void main(String args[])
	{
		Actor a=new Actor("Vedant","Talaviya");
		System.out.println("Name is:"+a.firstname+" "+a.lastname);
	}
}