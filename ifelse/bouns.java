package ifelse;

import java.util.Scanner;

// A compony decide give bouns of 5% to employee if his/her year of service is more than 5 years
// ask user for their salary and year of service and print the net bouns amount
public class bouns 
{
	static void Bouns(int salary,long year) 
	{
		long year_diffrence = (2022- year);
		
		if(year_diffrence>5) 
		{
			double bouns = salary*(0.05); 
			double increment = bouns + salary;
			
			System.out.println("your salary after 5% bouns: "+increment);
		}
		else 
		{
			System.out.println("u r salary is: "+ salary);
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter salary: ");
		int sa=sc.nextInt();
		
		System.out.print("Enter joining: ");
		long ye =sc.nextLong();
		
		Bouns(sa,ye) ;
		
	}

}
