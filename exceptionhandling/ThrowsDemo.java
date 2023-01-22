package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*this basically checked exception example throws and throw keyword mainly used for unchecked exception*/

public class ThrowsDemo {

	public static void main(String[] args)
	{
		Write wr = new Write();
		
		try 
		{
			wr.write();
			
		} 
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}		
	}

}
class Write
{
	void write() throws FileNotFoundException
	{
		FileInputStream fl = new FileInputStream ("d:/abc.txt");
		
	}
	
}
