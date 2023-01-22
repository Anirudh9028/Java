package Compony_Assingment;

import java.util.ArrayList;
import java.util.Collections;

public class anagram 
{
	/*Anagram means = In two string character must be same, irrespective of their position*/
	public static void main(String[]arg)
	{	
		String x = "race";
		String y = "care";
		
		String one = x.toLowerCase();
		String two = y.toLowerCase();

		int a = one.length()-1;
		int b = two.length()-1;

		if(a==b)
		{
			ArrayList<Character> s1 = new ArrayList<Character>();	
			ArrayList <Character>s2 = new ArrayList<Character>();

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


