package oops;

/*When a class inherits another class, it is known as a single inheritance. 
 * In the example given below, Dog class inherits the Animal class(method + veriable data), so there is the single inheritance
 * */

public class Inherit_Simple {

	public static void main(String[] args)
	{
		Dog kl = new Dog();
		
		kl.name = "tonny";
		kl.display();
		kl.eat();
	}

}
class Animal
{
	String name;
	
	public void eat() 
	{
		System.out.println("i am eat dog food: ");
	}
}
class Dog extends Animal
{
	public void display()
	{
		System.out.println("my name is dog "+" "+ name);
	}
	 
	
}