package loop;

public class FibinaciSeries 
{

	public static void main(String[] args) 
	{
		int num =5;
		int a = 0;
		int b = 1;
		int NextTerm;
		System.out.print("Fibinaci Series Upto given Number "+ num+"\n" +a + " " + b + " ");
		
		for(int i =0;i<num-1;i++) 
		{
			NextTerm = a+b;
			a=b;
			b=NextTerm;
			
			System.out.print(NextTerm+ " ");
		}

	}

}
