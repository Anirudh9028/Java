package Compony_Assingment;



public class MiniArrayFind {

	public static void main(String[] args) 
	{
		int arr [] = {145,758,46,84,98,78,4256};
		
		int min = arr[0];
		
		for(int i = 0;i<arr.length;i++) 
		{
			if(min> arr[i])
			{
				min = arr[i];
				
			}
		}
		
		System.out.println("Minimum array: "+min);
	}

}
