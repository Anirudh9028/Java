package Compony_Assingment;

public class duplicateArrayString 
{
	/*Find the Duplicate Array element*/
	
	public static void main (String[] arg) 
	{
		
		String[] name   = { "Java","JavaScript", "Python", "C", "Ruby", "Java" };

		for(int i =0;i<name.length;i++)
		{
			for(int j =i+1;j<name.length;j++)
			{
				if(name[i].equals (name[j])) 
				{
					System.out.println("duplicate element: "+ name[i]);
				}

			}



		}


	}



}










