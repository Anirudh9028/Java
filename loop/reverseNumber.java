package loop;
/* To reverse the number , we’ll use a while loop to break down the input  number and rearrange the number in reverse order.
 *  We’ll use the modulo operator to extract the digits from the number and the divide operator to shorten the number.*/

public class reverseNumber 
{

	public static void main(String[] args) 
	
	{
		int num =1234; // user input store in num veriable
		
		int reverse = 0; // reverse veriable used for store reverse value
		
		int rem; // rem veriable used for store remainder value (using module)
		
		while(num != 0) 
		{
			rem = num % 10; // to get the remainder...(extract the digits from the number)
			
			reverse = reverse*10 + rem; // to store the remainder value and maintaning length of number
			
			num = num/10; // to get qutiont value (means a number reduced by one digit) or length of digit
			
		};
		
		System.out.println("reverse number: " + reverse);

	}

}
