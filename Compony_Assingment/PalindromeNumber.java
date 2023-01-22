package Compony_Assingment;

public class PalindromeNumber 
{
	/*Palin-drome Number means when we reverse it ,it would be equal to original one */

	public static void main(String[] args) 
	{
		int num = 121;
		int rem;
		int reverse=0;
		int temp = num;// most imp step 
		
		while(temp!=0)
		{
			rem=temp % 10;
			
			reverse = reverse*10+rem;// here we hv magic
			
			temp=temp/10;
		};
		
		if(reverse == num) 
		{
			System.out.println("Given number is palindrome number :"+ num);
		}
		else {System.out.println("Given number is not palindrome number :"+ num);}

	}

}
