package oops;
import java.util.*;

class EmpData 
{
	private String emp_name;
	private int emp_id;
	private int emp_age;
	
	public void setemp_name(String name) 
	{
		this.emp_name = name;
	}
	public void setemp_id(int id) 
	{
		this.emp_id = id;
	}
	public void setemp_age(int age)
	{
		this.emp_age = age;
	}
	public String getemp_name() 
	{
		return emp_name;
	}
	public int getemp_id() 
	{
		return emp_id ;
	}
	public int getemp_age() 
	{
		return emp_age;
	}
} 

public class Encap2 {

	public static void main(String[] args) 
	{
		EmpData A = new EmpData();
		
//		A.setemp_name("Anirudh");
//		A.setemp_id(811);
//		A.setemp_age(30);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name: ");
		A.setemp_name(sc.nextLine());
		
		System.out.println("enter age: ");
		A.setemp_age(sc.nextInt());
		
		System.out.println("enter id: ");
		A.setemp_id(sc.nextInt());

		System.out.println(A.getemp_name());
		System.out.println(A.getemp_id());
		System.out.println(A.getemp_age());
		
		
		
		
		
		
		
		
		

	}

}
