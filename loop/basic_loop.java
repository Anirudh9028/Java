package loop;
import java.util.*;

public class basic_loop {

	public static void main(String[] args)
	{
		basic bs =new basic();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 number: ");
		int us = sc.nextInt();
		
		System.out.println("Enter 2 number: ");
		int sd = sc.nextInt();
		
		
		
		//bs.numbers();  /*print 1 to 10 numbers*/
		
		// bs.FirstTenAdd(); // addition of first ten digit
		
		//bs.Usertable(us); // ask user number and make a table
		
		//bs.factorial(us); // ask user number and make factorial 
		
		bs.powerdemo(us,sd) ;
		

	}

}
class basic 
{
	public void numbers() 
	{
		for(int i=1;i<=10;i++) 
		{
			System.out.println(i);
		}	
	}
	
	public void FirstTenAdd() 
	{
		int sum =0;
		for (int i =1;i<=10;i++) 
		{
			sum=sum+i;
		}
		System.out.println("sum of first 10 number is: "+sum);
	}
	public void Usertable(int a) 
	{
		int table = 1;
		
		for(int i =1;i<=10;i++)
		{
			table = a*i;
			System.out.println(a+"*"+i+" = "+ table);
		}
	}
	public void factorial(int b) 
	{ 
		int factorial=1 ;
		
		for(int i =1;i<=b;i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
	
	public void powerdemo(int base,int power) 
	{
		  
		//int base;
		//int power; 
		
		int result = 1;
		
		for(int i=1;i<=power;i++) 
		{
			result*=base;
		}
		System.out.println(result);
		
		
		
	}
		
	
}
