package triel;

class FirstReapeatedCharacter
{
	public static void main (String [] arg)
	{
		String name = "java";
		int flag=0;
		
		/*for ingnoring space*/
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				continue;
				
			}
			
			for(int j=i+1;j<name.length();j++) 
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println("First Reapeted Character:" + name.charAt(i));
					flag = 1;
					break;//break for inner for loop
				}
				if(flag==1)
				{break;}	//break for outer for loop
			}
				
		}
		if(flag==0)
		{System.out.println("No repeated char found");}

	}

}







