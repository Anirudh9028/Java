package exceptionhandling;

public class nestedtrycatch{

	public static void main(String[] args) 
	{
		demoone dm = new demoone();
		
		//dm.nestedtry();
		dm.nestedcatch();

	}

}
class demoone
{
	public void nestedtry() 
	{
		try 
		{
			try 
			{
				int a[] = {10,20,30,60};
				
				System.out.println(a[5]);
				
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println("out of indexing value wont print"); // show user define msg
				//a.printStackTrace(); // show the Exeception details
			}
			
			System.out.println(100/0);
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("\n"+e+"...java don't allow integer divided by zero "); // show user define msg
			//e.printStackTrace(); // show the Exeception details
		}
	}
	
	public void nestedcatch() 
	{
		try 
		{
			int a[] = {10,20,30,60};
			
			System.out.println(a[5]);
			
		}
		catch(Exception e) 
		{
			try 
			
			{
				String str = "Anirudh";
				int a = Integer.parseInt(str);
				System.out.println(a);
			}
			
			catch(NumberFormatException n) 
			
			{
				System.out.println("String not convert into integer value"); // print Exception msg n or user define msg
				//n.printStackTrace();
			}	
		}
		System.out.println("Program continue");
		
		
	}
}
