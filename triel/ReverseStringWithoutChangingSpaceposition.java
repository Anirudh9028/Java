package triel;

class ReverseStringWithoutChangingSpaceposition
{
	public static void main (String [] arg)
	{
		String name = "I am ok ";
		
		/*Converts this string to a new character array.*/
		char[] charList1 = name.toCharArray();
		char[] charDuplicatelist = new char[name.length()];// length of array
		
		
		/*space figured out*/
		
		for(int i=0;i<charList1.length;i++) 
		{
			if(charList1[i]==' ') 
			{
				charDuplicatelist[i]=' '; // store space along with index position
			}
			
		}
		int j =charDuplicatelist.length-1;// 7
		
		for(int i=0; i<charList1.length; i++) 
		{
			if(charList1[i]!=' ')//considering not space
			{
				if(charDuplicatelist[j]==' ') 
				{
					j--;
				}
				charDuplicatelist[j] = charList1[i];
				j--;
				
			}
		}
		/* character array convert in to string.*/
		
		System.out.println(String.valueOf(charDuplicatelist));
		
		
		
		
		
		
		
	}
}







