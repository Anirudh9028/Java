package loop;

public class DuplicateCountString 
{

	public static void main(String[] args) 
	{
		String sd ="tataa";
		//int ln =sd.length();
		
		int a = 0;
		for(int i = 0; i<sd.length(); i++) 
		{
			for(int j = 0; j<sd.length();j++) 
			{
				if(sd.charAt(i)==sd.charAt(j)) 
				{
					a=a+1;
				}
			}
			System.out.println(sd.charAt(i) + " comes " + a +" times");
			
			String b = String.valueOf(sd.charAt(i));
			
			sd = sd.replaceAll(b,"");
			
			a=0;
//			String b = String.valueOf(sd.charAt(i)).trim();
//			sd = sd.tr
//			System.out.println(sd);
			
		}
	}
	
}
