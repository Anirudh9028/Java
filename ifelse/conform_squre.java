package ifelse;
import java.util.*;

public class conform_squre 
{
	static void check_squre(int a,int b) 
	{
		if (a==b) 
		{
			System.out.println("it is a squre");
		}
		else 
		{
			System.out.println("it is rectangle");
		}
	}
	

	public static void main(String[] args) {
		int p,q;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Put value of length: ");
		p = sc.nextInt();
		
		System.out.println("Put value of width: ");
		q = sc.nextInt();
		
		check_squre(p,q);
		
	}

}
