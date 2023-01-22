package Compony_Assingment;
import java.util.*;
/* 1.Prime number Only divisible by 1 OR itself ....So count of divisible is two only means..1 or itself
 * 2.we divide by (n-1) all numbers to the n and check or count is 2 if it is 2 then it is prime or else not prime   */

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int a = sc.nextInt();
		
		prnumber pr = new prnumber();
		pr.pr(a);

	}

}
class prnumber
{
	public void pr(int n) 
	{
		int count = 0; // store a count value.. 
		
		for(int i =1;i<=n;i++) // apply a for loop for dividing all number (n-1) to the n
		{
			if(n%i==0) // Apply condition where..n divisible by n and itself also 
			{
				count= count +1; // increase count
			}
		}
		if(count==2) // for prime number divisible count should be two means...1 or itself
		{
			System.out.println(n+" is a Prime number..");
		}
		else //
		{
			System.out.println(n+" is not a Prime number..");
		}
		
		
		
		
	}
	
//	public static boolean isPrime (int num) 
//	{
//		int n = num;
//		int count = 0; // store a count value.. 
//		
//		for(int i =1;i<=n;i++) // apply a for loop for dividing all number (n-1) to the n
//		{
//			if(n%i==0) // Apply condition where..n divisible by n and itself also 
//			{
//				
//				count= count +1; // increase count
//			}
//		}
//		if(count==2) // for prime number divisible count should be two means...1 or itself
//		{
//			
//			return true;
//		}
//		else //
//		{
//			
//			return false ;
//		}
//		
//	}
}
