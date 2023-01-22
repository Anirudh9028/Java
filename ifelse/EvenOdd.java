package ifelse;

import java.util.*;

public class EvenOdd {
	
	static void evenodd(int n) 
	{
		if(n%2==0) 
		{
			System.out.println(n +" is even");
		}
		else 
		{
			System.out.println(n +" is odd");
		}
		
	}

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a value: " );
		n = sc.nextInt();
		
		evenodd(n);
		
		

	}

}
