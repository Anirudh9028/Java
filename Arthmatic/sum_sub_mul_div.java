package Arthmatic;

import java.util.*;

public class sum_sub_mul_div {
	
	static void sum(double a, double b)
	{
		double sum = a+b;
		System.out.println("sum of: "+a +" and " +b +" is: "+sum+"\n");
	}
	
	static double sub(double a, double b) 
	{
		double sub = a-b;
		System.out.println("subtraction of: "+a+" and "+ b +" is: "+ sub+"\n");
		return sub; //mul(a,b);
	}
	
	static void mul (double a,double b)
	{
		double mul = a*b;
		System.out.println("multiplication of: "+ a +" and "+ b +" is: "+ mul+"\n");
				
	}
	
	static void div(double a, double b)
	{
		double div = (a/b);
		System.out.println("division of: "+a+" and "+b+" is: "+ div+"\n");	
	}

	public static void main(String[] args) {
		 double a, b ;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("put a value of a: ");
		 a = sc.nextDouble();
		 
		 System.out.println("put a value of b: "+"\n");
		 b= sc.nextDouble();
		 
		 sum(a, b);
		 sub(a,b);
		 mul(a,b);
		 div(a,b);
		 
		 
		 

	}

}
