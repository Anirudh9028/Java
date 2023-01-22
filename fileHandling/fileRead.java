package fileHandling;
import java.io.*;
public class fileRead {

	public static void main(String[] args) 
	{
		try 
		{
			FileReader f = new FileReader("C:\\Users\\Anirudh\\Desktop\\file Handling\\first.txt");
			
			try 
			{
				/*every character store in ascii value so it will retrive data in ascii value
				 * to convert ascii value data in to charactor use char casting*/
				int i ;
				while((i = f.read())!=-1) // loop for fetch ascii value of character
				{
					System.out.print((char)i);
				}
			} 
			finally 
			{
				f.close();
			}
		} 
		
		catch(IOException i) 
		{
			System.out.println("Exception Handled: "+i);
		}

	}

}
