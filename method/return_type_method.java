package method;
import java.util.*;

public class return_type_method {
	
//	public static int sum() // method with return type int + no argument
//	{
//		int a =10, b=20;
//		int sum = a+b;
//		return sum;
//	}
//	
	public static int add (int p,int q) // method with return type int  +  argument
	{
		int add = p+q;
		return add ;
	}

	public static void main(String[] args) {
		 int p,q;
		 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("put value of a: ");
		 p = sc.nextInt();
		 
		 System.out.println("put value of q: ");
		 q = sc.nextInt();
		
//		 int sum = sum();
//		 System.out.println(sum);
		 
		 int add = add(p,q);
		 System.out.println("addition of two no: "+add);
				
				

	}

}
