package oops;
/*multiple inheritance in Java
 * 
 * 
 * 
 * */
interface Printable
{  
	void print();  
}

interface Showable
{  
	void print();  
}  
  
class TestInterface3 implements Printable, Showable //multiple iterface call at time
{  
public void print()
{
	System.out.println("Hello");
}  
 
} 

public class interface2 {

	public static void main(String args[])
	{  
	TestInterface3 obj = new TestInterface3();  
	obj.print();  
	 } 

}
