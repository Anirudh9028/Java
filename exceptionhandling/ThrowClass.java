package exceptionhandling;
import java.util.*;

public class ThrowClass {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		 System.out.println("print your age: ");
		 
		 int age = sc.nextInt();
		 
		 if (age<18) 
		 {
			 throw new AgeException("Your age is not for voting"); 
		 } 
		 else 
		 {
			 System.out.println("your eligible for voting");
		 }
		 
		 
		 

	}

}
/* to create customize exception at run time first 
 * we need inherited (extends) RuntimeException class 
 * And for checked Exception we need inherited (extends)Exception class
 * and make parameter constructor , with help of super key assign customize msg to default exception handler
 * when we need to call again  use new keyword and class or constructor name
 * syntax:- throws keyword + new keyword + class or constructor name throw new AgeException(" customize msg "); 
 * */
class AgeException extends RuntimeException
{
	AgeException(String msg)
	{
		super(msg);
	}
}

