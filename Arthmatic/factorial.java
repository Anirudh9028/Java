package Arthmatic;
import java.util.*;

public class factorial {
	
	
	static void Factorial(int n) 
	{
		if (n<0) 
		{
			
			return; // basically it will return or not move forward after condition satisfied
		}
		int factorial = 1 ;
		
		for(int i=n; i>=1;i--) 
		{
			factorial = factorial*i ;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int n ;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("What is your factorial no: ");
		n = sc.nextInt();
		
		Factorial(n);
		
		
		

	}

}
