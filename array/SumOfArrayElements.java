package array;

public class SumOfArrayElements {

	public static void main(String[] args) 
	{
		int array [] = {10,20,30,40,45};
		
		int sum =0;
		
		for(int i =0;i<array.length;i++) 
		{
			sum= sum+array[i];
		}
		System.out.println("Sum of Array Element is: "+sum);
		

	}

}
