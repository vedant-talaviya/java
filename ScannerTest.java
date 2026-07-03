import java.util.*;
class ScannerTest
{
       public static void main (String args[])
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter rollno : ");
		   int rollno=sc.nextInt();
		   
		   System.out.println("Enter name : ");
		   String name=sc.next();
		   
		   System.out.println("Enter fees");
		   double fees=sc.nextDouble();
		   
		   System.out.println("Enter stream : ");
		   String str=sc.next();
		   
		   System.out.println("Rollno : "+rollno+"\n name:"+name+"\n fees : "+fees+"\n stream : "+str);
	   }
}