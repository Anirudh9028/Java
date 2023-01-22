package exceptionhandling;

public class trycatch {

	public static void main(String[] args) 
	{
        trycatchdemo tc = new trycatchdemo();
		//tc.DemoOne();
		//tc.DemoTwo();
		//tc.DemoThree();
        tc.DemoFour();

	}

}

class trycatchdemo
{/* try catch is used for to avoid the Termineting program after found Exception thinks */
	public void DemoOne() 
	{
		try 
		{
			int a = 100/0; // it's a arithmetic exception
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e+"...java don't allow integer divided by zero "); // show user define msg
			//e.printStackTrace(); // show the Exeception details
		}
		
		System.out.println("DemoOne end: ");
	}
	
	public void DemoTwo() 
	{
		String str = null;
		
		try 
		{
			System.out.println(str.toLowerCase());
		}
		catch(NullPointerException n) 
		{
			//System.out.println(n); // print Exception msg n or user define msg
			n.printStackTrace();
		}	
		
	}
	public void DemoThree() 
	{
		String str = "Anirudh";
		
		try 
		{
			int a = Integer.parseInt(str);
			System.out.println(a);
			
			/*it won't print after terminiting any program...so in try block write only Exception code 
			 * it wil print when our business logic is correct (without any faloowing exception)  */
			
			System.out.println("Number Formatt Exception Demo"); 
		}
		catch(NumberFormatException n) 
		{
			System.out.println("String not convert into integer value"); // print Exception msg n or user define msg
			//n.printStackTrace();
		}
				
	}
	public void DemoFour() 
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
		finally 
		{
			System.out.println("Finally block"); // it will all time executed
		}
	}
	
	
	
	
	
	
	
}


