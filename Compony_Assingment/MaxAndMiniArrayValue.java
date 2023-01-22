package Compony_Assingment;



public class MaxAndMiniArrayValue {

	public static void main(String[] args) 
	{
		
		int arr [] = {4567,458,4226,845,789,3256,456};
		
		int max = arr[0];
		
		int mini = arr[0];
		
		for(int i=0;i<arr.length;i++) 
		{
			if(max<arr[i])
			{
				max= arr[i];
			}
			
			if(mini>arr[i])
			{
				mini= arr[i];
			}
		}
		System.out.println("Max arr value: "+ max);
		System.out.println("Mini arr value: "+ mini);
		
		
	}

}
