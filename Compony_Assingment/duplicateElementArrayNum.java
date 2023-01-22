package Compony_Assingment;

public class duplicateElementArrayNum 
{

	
	public static void main (String[]arg)
	{

		int num [] = {1,2,2,3,3,4};
		
		System.out.println(num.length);

		for(int i= 0;i<num.length;i++ )
		{
			for(int j = i+1; j<num.length; j++)
			{
				if(num[i] == num[j])
				{
					System.out.println("Duplicate Elements are: " + num[i]);
				}

			}


		}

	}
}










