package oops;
/*When two or more classes inherits a single class, it is known as hierarchical inheritance. 
 * In the example given below, Dog and Cat classes inherits the Animal class, 
 * so there is hierarchical inheritance.*/

public class inheritance_hierachy {

	public static void main(String[] args) 
	{
		cat al = new cat();
		
		al.cat();
		al.parent();
		
		rat dg = new rat();
		dg.rat();
		dg.parent();

	}

}
class animal
{
	public void parent()
	{
	System.out.println("super class");
	}
}
class rat extends animal
{
	public void rat() 
	{
		System.out.println("chew");
	}
}
class cat extends animal
{
	public void cat() 
	{
		System.out.println("meow");
		
	}
	
}

