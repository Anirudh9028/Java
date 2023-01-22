package loop;
import java.util.*;

public class tables {
	
	static void table_with_input() 
	{
		
		for(int i =1;i<=10;i++) 
		{
			int table = 2*i;
			System.out.println(table);
		}
	}
	static void table_with_input(int a)
	{
		
		for(int i =1 ;i<=10;i++)
		{
			int table= a*i;
			System.out.println(table);
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n ;
		System.out.println("put value of table u want: ");
		n= sc.nextInt();
		
		
		table_with_input(n);
	
		//table_with_input();

	}

}
