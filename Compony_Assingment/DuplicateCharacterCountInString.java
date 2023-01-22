package Compony_Assingment;

public class DuplicateCharacterCountInString 
{

	/*Find The duplicate character Count in string*/
	public static void main(String[] args) 
	{
	
		 String str = "w3schols";
		  
		  
		  
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  
		  for (int i = 0; i < inp.length; i++)
		  {
		   for (int j = i + 1; j < inp.length; j++) 
		   {
		    if (inp[i] == inp[j])
		    {
		    	
		     System.out.print(inp[j]+",");    
		     //break;
		    }
		    
		   }
		   
		
		
		
	}
		  
			
		}
	}
	

