package oops;
/*abstract method must be override in sub class otherwise sub class also become a abstract class
 * supose you have two abstract method in parent class...so you need to call all abstract methods which is present in a parent class
 * if you wont cl then it will throw error
 */


abstract class vehicle // bz of abstract method is present in this class that why we declear whole class as abstract
{
	public abstract void car(); // abstract method
	public abstract void bike(); 
	 
}
class bmw extends vehicle
{
	public void bike() 
	{
		System.out.println("two wheel\n390cc");
	}
	public void car() 
	{
		System.out.println("four wheel\n2000cc");
	}
}

public class Concept_Abstruct_two {

	public static void main(String[] args) 
	{
		bmw dk=new bmw();
		dk.bike();
	
	}

}
