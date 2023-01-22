package ifelse;

import java.util.*;

public class leap_year
{
	static void LeapYear(int year) 
	{
		
		if (year%400==0||(year % 4== 0 && year%100!=0))
		{
			System.out.println(year+ ": is leap year");
		}
		else 
		{
			System.out.println(year + ": is not leap year");
		}
			
	}

	public static void main(String[] args) 
	{
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print year: ");
		a = sc.nextInt();
		
		LeapYear(a); 
		
		

	}

}
