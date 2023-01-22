package Compony_Assingment;
/*However, Armstrong number is any number following the given rule 
abcd… = a^n + b^n + c^n + d^n + …
Where n is the order(length/digits in number)...here n is 4 
eg: 
370= 3^3+7^3+0^3 = 27+343 = 370

1. take out digit length
2. reverse the number and each number mul with digit length times 
3. make sum of it && compair with user input 

*/

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int num = 1634;
		int org = num;
		int rem ;
		double result = 0;// double bz size matters

		int t1 = num;
		int length = 0;
		
		while(t1!=0)
		{
			t1 = t1/10;
			
			length = length + 1;
		}
		
		//System.out.println(length);
		
		while(org!=0)
		{

		rem = org%10;
		result = result + Math.pow(rem, length);
		org= org/10;


		}
		if(result==num)
		{

		System.out.println("num is Amstrong");
		}
		else
		{System.out.println("num is not Amstrong");}


	}


}











