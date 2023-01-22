package triel;

import java.util.ArrayList;
import java.util.Collections;

public class anagram 
{
	public static void main(String[]arg)
	{	
		String one = "race";
		String two = "care";
		
		

		int a = one.length()-1;
		int b = two.length()-1;

		if(a==b)
		{
			ArrayList s1 = new ArrayList();	
			ArrayList s2 = new ArrayList();

			for(int i = 0 ;i<=a;i++)
			{	
				s1.add(one.charAt(i));
				s2.add(two.charAt(i));
			}

			Collections.sort(s1);
			Collections.sort(s2);

			if(s1.equals(s2))
			{ System.out.println("it is Anagram");	}

			else{ System.out.println("not a anagram");}

		}
		else
		{System.out.println("not a anagram");}


	}

}


