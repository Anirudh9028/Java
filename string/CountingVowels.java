package string;
import java.util.*;

public class CountingVowels {
	
	/*write a Java program to count the number of vowels in a given string by user*/

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String s = sc.nextLine();
		
		String a = s.toLowerCase();
		
		
		int vowels=0;
		
		for (int i =0;i<a.length();i++) 
		{
			if(a.charAt(i)== 'a' || a.charAt(i)== 'e' || a.charAt(i)== 'i' || a.charAt(i)== 'o'||a.charAt(i)== 'u') 
			{
				vowels++;
			}
		}
		System.out.println(vowels);
	
		
		

	}

}
