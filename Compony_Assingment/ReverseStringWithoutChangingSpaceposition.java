package Compony_Assingment;

class ReverseStringWithoutChangingSpaceposition
{
	public static void main (String [] arg)
	{
		String name = "I am ok";
		
		/*Converts this string to a new character array.*/
		char[] List1 = name.toCharArray();// method used to convert into character
		char[] list2 = new char[name.length()];// same size of array as charList1
		
		
		System.out.println(name.length());
		System.out.println(List1.length);
		System.out.println(list2.length);
		
		
		
		
		/*space figured out*/
		
		for(int i=0;i<List1.length;i++) 
		{
			if(List1[i]==' ') 
			{
				list2[i]=' '; // store space along with index position in arraylist two
			}
			
		}
		int j =list2.length-1;// 7 = Array list two size
		
		for(int i=0; i<List1.length; i++) 
		{
			if(List1[i]!=' ')// check not space in Array list one
			{
				if(list2[j]==' ') // skip the space, and go to previous array position Array list 2
				{
					j--;
				}
				list2[j] = List1[i];//Arraylist two feel with reverse position
				j--;
				
			}
		}
		/* character array convert in to string.*/
		
		System.out.println(String.valueOf(list2));
		
		
		
		
		
		
		
	}
}







