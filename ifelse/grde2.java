package ifelse;

import java.util.Scanner;

public class grde2 {

	public static void main(String[] args) 
	{
		
		grade gd = new grade();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your grade percentile: ");
		int b = sc.nextInt();
		
		gd.check(b);
		
	}

}
class grade
{
	public void check(int a )
	{
		//int marks = a ;
		
		if(a<25) 
		{System.out.println("your grade is F");}
		
		else if(25<=a && a<45)
		{System.out.println("your grade is E");}
		
		else if (45<=a && a<50)
		{System.out.println("your grade is F");}
		
		else if (50<=a && a<60)
		{System.out.println("your grade is C");}
		
		else if (60<=a && a<80) 
		{System.out.println("your grade is B");}
		
		else if(80<=a && a<=100)
		{System.out.println("your grade is A");}
		
		else {System.out.println("your grade is exceed than 100");}
	}
}

