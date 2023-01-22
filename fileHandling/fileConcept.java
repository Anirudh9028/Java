package fileHandling;

import java.io.File;    // ip \ op pckg Or simply use *
import java.io.IOException;// IOException pckg

public class fileConcept
{

	public static void main(String[] args) throws IOException  // in Method signature need to mention throws IOException
	{
		a nm = new a();
		
		 nm.fileHandlingWithTryCatch();
		 nm.fileHandlingWithThrows() ;
		
	}
}

class a 
{
	public void fileHandlingWithTryCatch() // exception handlling by Programmer using try catch block
	{
		System.out.println("exception handlling by Programmer using try catch block\n");
		
		File f = new File("C:\\Users\\Anirudh\\Desktop\\file Handling\\first.txt"); // file path + file name...To be created

		try
		{
			if(f.createNewFile()) // .createNewFile()......>method create new file
			{
				System.out.println("File Created....");
			} 
			else 
			{
				System.out.println("File Already Exist..");
			}
		
		}
		catch(IOException i) // for Handle THe Exception
		{
			System.out.println("Exception Handled...");
		}
		
	}
	
	public void fileHandlingWithThrows() throws IOException // in Method signature need to mention throws IOException
	
	{
		/*Checked Exception handled by JVM it self Using Throws key word + Checked Exception
		 * for that need to declear Throws key word + Checked Exception In Method signature(Two Times = 1.Local Method Signature And 2.Main Method Signature) 
		 * but problem is there is no gaurantee that finally block will executed */
		
    
		System.out.println("Checked Exception handled by JVM it self Using Throws key word + Checked Exception");
		
		File f = new File("C:\\Users\\Anirudh\\Desktop\\file Handling\\firstone.txt"); // file path + file name...To be created

		
		if(f.createNewFile()) // .createNewFile()......>method create new file
		{
			System.out.println("File Created....");
		} 
		else 
		{
			System.out.println("File Already Exist..");
		}
	}
	
	
	
	}

