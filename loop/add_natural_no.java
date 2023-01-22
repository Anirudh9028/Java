package loop;
import java.util.*;

public class add_natural_no {
	
	static void without_input() 
	{
		int sum = 0;
		for(int i = 1;i<=4;i++)
		{
			sum = sum + i ;
		}
		System.out.println("sumission from 1 to 4 is: "+sum);
	}
	static void with_user_input(int a) 
	{
		int add = 0;
		for(int i =1;i<=a;i++) 
		{
			add= add+i;
		} 
		System.out.println("sumission from 1 to " +a+" is: " +add);
	}
		
	

	public static void main(String[] args) 
	{
		int a ;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a value");
		a =sc.nextInt();
		
		 with_user_input(a);
		
		//without_input() ;
		 

	}

}
