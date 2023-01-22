package fileHandling;

//import java.io.FileWriter;
//import java.io.IOException;
import java.io.*;

public class fileWrite {

	public static void main(String[] args) 
	{
		try 
		{
			FileWriter f = new FileWriter ("C:\\Users\\Anirudh\\Desktop\\file Handling\\first.txt");
			try 
			{
				f.write("Java Programming Is the Best Language....!");
				
			} 
			finally
			{
				f.close();
			}
			System.out.println("Data Write In File Succesufully");
		}
		catch(IOException i)
		{
			System.out.println(i);
		}

	}

}
