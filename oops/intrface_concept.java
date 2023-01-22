package oops;

import java.util.Scanner;

/*An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * interfaces can have abstract methods and variables. It cannot have a method body.
 * It is used to achieve abstraction and multiple inheritance in Java
 * */


interface client_info
{
	void input ();
	void output();
} 
class raju implements client_info
{
	String name; long sal;
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter your salary: ");
		sal = sc.nextLong();
		
	}
	public void output() 
	{
		System.out.println(name+"\n"+sal);
	}
	
}


public class intrface_concept {

	public static void main(String[] args) 
	{
		raju rj = new raju();
		
		rj.input();
		rj.output();

	}

}
