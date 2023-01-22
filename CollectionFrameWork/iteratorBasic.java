package CollectionFrameWork;

import java.util.ArrayList;

/* iterator cursor used with any object of collection i.e List, Set, Queue*/
import java.util.Iterator;

public class iteratorBasic 
{
	/* iterator cursor used with any object of collection i.e List, Set, Queue*/

	public static void main(String[] args) 
	{
		basicOne bo = new basicOne();
		
		bo.IteratorAndForLoop();
		
		

	}

}
class basicOne 
{
	
	public void IteratorAndForLoop() 
	{
		ArrayList lt = new ArrayList(); // need to import ArrayList class .....import java.util.ArrayList;
		
		
		lt.add("Anup");
		lt.add("Anirudh");
		lt.add("vishakha");
		lt.add(10);
		
		Iterator it = lt.iterator(); // need to import Iterator interface.....import java.util.Iterator;
		
		System.out.println("Using iterator() We Fetch a value");
		
		while(it.hasNext()) // .hasNext()(used just like a condition) method  Returns true if the iteration has more elements.
		{
			System.out.println(it.next()); // .next() method Returns the next element in the iteration.
		}
		
		
		
		System.out.println("");
		System.out.println("Using For loop We Fetch a value");
		
		for(int i =0;i<lt.size();i++) // size() method used for knowing length Array list 
		{
			System.out.println(lt.get(i)); // get() method used for getting the value from Array List
		}	
			
		
	}	
	
}


