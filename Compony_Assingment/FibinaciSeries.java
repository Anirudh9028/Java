 package Compony_Assingment;

public class FibinaciSeries 
{

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int num =5;
		int nextterm;

		System.out.print(a+" "+b+" ");

		for(int i =0;i<num-1;i++)
		{
		nextterm = a+b;
		a=b;
		b=nextterm;

		System.out.print(nextterm +" ");
		}


	}

}
