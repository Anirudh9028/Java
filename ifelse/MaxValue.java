package ifelse;
import java.util.*;

public class MaxValue {
		
	static void greater(int a,int b,int c) 
	{
		
		if (a>b && a>c) 
		{
			 System.out.println("A is greater: " + a);
		}
		else if (b>a && b>c)
		{
			System.out.println("B is greater: " + b);
		}
		else 
		{
			System.out.println("C is grater:  " + c);
		}	
	}

	public static void main(String[] args) {
		
		int a ,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("put first value: ");
		a = sc.nextInt();
		
		System.out.println("put second value: ");
		b= sc.nextInt();
		
		System.out.println("put third value: ");
		c= sc.nextInt();
		
		greater(a,b,c);
			
	}

}
