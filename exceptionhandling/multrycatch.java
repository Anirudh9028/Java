package exceptionhandling;

public class multrycatch {

	public static void main(String[] args) 
	{
		mulDemoOne md =new mulDemoOne();
		
		md.demoone();

	}

}
class mulDemoOne
{
	public void demoone() 
	{
		try 
		{
			int a[] = {10,20,30,60};
			System.out.println(a[5]);		
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println(e+"...java don't allow integer divided by zero "); // show user define msg
			//e.printStackTrace(); // show the Exeception details
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("out of indexing value wont print"); // show user define msg
			//a.printStackTrace(); // show the Exeception details
		}
		catch(NumberFormatException n) 
		{
			System.out.println("String not convert into integer value"); // print Exception msg n or user define msg
			//n.printStackTrace();
		}
		catch(Exception e) // call the parent class of the all the sub class
		{
			System.out.println(e+"\ncall parent class help to find the exception class"); // print Exception msg n or user define msg
			//n.printStackTrace(e);
		}
		
	}
	
}
