package Compony_Assingment;

public class revserEachWord 
{

	public static void main (String[]arg)
	{

		String inputString = "Anirudh";
		 String[] words = inputString.split(" ");
         
	        String reverseString = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	            System.out.println(word);
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            System.out.println(word.charAt(3));
	            reverseString = reverseString + reverseWord + " ";
	        }
	         
	        System.out.println(reverseString);




}


}	








