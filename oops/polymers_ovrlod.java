package oops;
/*Compile-time polymorphism is also known as static polymorphism or early binding. 
 *Compile-time polymorphism is a polymorphism that is resolved during the compilation process.
 *compile time polymorphism = achiving through over-loading method
 * 
 * */

public class polymers_ovrlod 
{
	
	void add ()
	{
		int a= 10,b=20,c;
		c = a+b;
		System.out.println("Default method value "+ c);
	}
	void add(int x,int y)
	{
		int c;
		c = x+y;
		System.out.println("same data type with parametric method: "+c);
	}
	void add (int x, double y) 
	{
		double c;
		c= x+y;
		System.out.println("diffrent data type with parametric method:"+c);
	}
	
	public static void main(String[] args) 
	{
		polymers_ovrlod pl = new polymers_ovrlod();
		
		pl.add(); pl.add(100,200); pl.add(10,12.5);
		
	}

}

