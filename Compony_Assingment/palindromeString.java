package Compony_Assingment;

public class palindromeString {

	public static void main(String[] args) 
	{
		String pa = "radar";
		 
		int length = pa.length()-1;
		System.out.println(length);
		
		String rev="";
		
		for(int i = length;i>=0;i--) 
		{
			rev= rev +pa.charAt(i);
		}

		System.out.println(rev);
		
		
		if (pa.equals(rev)) 
		{
			System.out.println("panlindrom string: " + rev);
			
		}
		else
		{
			System.out.println("not a panlindrom string: " + pa);
			
		}	

	}

}
