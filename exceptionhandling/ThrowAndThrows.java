package exceptionhandling;


/*Customize Exception
 *  this type of method mostly useful for unchecked exception 
 * 1. First create customize exception then throw it toward users */

public class ThrowAndThrows {

	public static void main(String[] args) 
	{
		person pr = new person();
		
		try 
		{
			pr.age(16);
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception handeled Succesfully");
		//pr.age(16); // if it is not handle then show error

	}

}

class person 
{
	/* throws key warn to users exception will be there.....it will warn during compile...
	 * if throws keyword not here then during runtime show error which will we throw in below method*/ 
	
	void age(int age) throws Exception 
	{
		if(age<18) 
		{
			/*already we create this type of constructor (AgeException)
			 * when we need to call again  use new keyword and class or constructor name
			 * syntax:- throws keyword + new keyword + class or constructor name */
			throw new AgeException("Your age is not for voting"); 
		}
		else
		{System.out.println("your eligible for voting");}
	}
}
