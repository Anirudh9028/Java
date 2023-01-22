package array;

public class largestNumberFind 
{

	public static void main(String[] args) 
	{
		int[] array = {10,20,30,40,50}; // decleare array
		
		int max = array[0]; // choose 0 index value(10) in array and store in max veriable  
		
		for(int i =0;i<array.length;i++) //for loop used for itrate Array
		{
			if(max<array[i]) // condition check largest number 
			{
				max = array[i]; //store the largest number
			}
			
		}
		System.out.println("Largest number is: "+ max); // print out largest number in Array
		
		

	}

}
