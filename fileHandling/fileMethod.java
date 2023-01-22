package fileHandling;

import java.io.File;

public class fileMethod {

	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\Anirudh\\Desktop\\file Handling\\first.txt");

		if(f.exists())
		{
			System.out.println("File Name: "+ f.getName());
			System.out.println("File Location: "+ f.getAbsolutePath());
			System.out.println("File Writable: "+ f.canWrite());
			System.out.println("File Readable: "+ f.canRead());
			System.out.println("File Size in Byte: "+ f.length());
			
		}
		else
		{
			System.out.println("File doesn't Exists");
		}
	}

}
