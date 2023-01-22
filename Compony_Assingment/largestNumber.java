package Compony_Assingment;



public class largestNumber {

	public static void main(String[] args) 
	{
	int arr[]= {12,13,14,17,20,56,47,98};
		
		int max = arr[0];
		
		
		for(int i=0;i<arr.length;i++) 
		{
			if(max<arr[i]) 
			{
				max = arr[i];
			}
		}
		
		System.out.println("maximun value: " + max );
	}

}
