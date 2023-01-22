package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CastingLogicStringAndArraylist
{

	public static void main(String[] args) 
	{
		CastingString cs= new CastingString();
		cs.MethodOne();
	}

}
class CastingString
{
	public void MethodOne() 
	{
		/*String Casting Allows u To use All String Methods Over Array List*/
		ArrayList<String> as = new ArrayList<String>();
		
		as.add("Royal Enfield");
		as.add("Ducati");
		as.add("Kawasaki");
		as.add("Trumph");
		as.add("KTM");
		
		/*Collections.sort() method sort a list in acesending order
		 *For that Need To import...import java.util.Collections*/
		Collections.sort(as); 
		
		Iterator itr = as.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		String bikeName = as.get(2);
		System.out.println(">>>>>>>>>>>"+bikeName);
		
		if(as.contains(bikeName)) 
		{
			System.out.println("Yes...Bike Name in List");
		}
		else 
		{
			System.out.println("No...Bike Name is Not in List");
		}
		if(as.get(0).equals(bikeName)) 
		{
			System.out.println("Its equal");
		} 
		else 
		{
			System.out.println("its Not Equal");
		}
		
		
		
		
	}

	
		
	
}
