package fileHandling;
import java.io.*;

public class fileRename {

	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Anirudh\\Desktop\\file Handling\\first.txt");
		File r = new File("C:\\Users\\Anirudh\\Desktop\\file Handling\\RenameFile.txt");

		if(f.exists()) 
		{
			System.out.println(f.renameTo(r));
		}
		else
		{
			System.out.println("File no exists");
		}
		
	}

}
