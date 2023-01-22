package CollectionFrameWork;

import java.util.ArrayList;

/*List Iterator can be used only for List implemented classes i.e = Array list , LinkedList, Vector Stack   */
import java.util.ListIterator;

public class listIteratorBasic 
{

	public static void main(String[] args) 
	{
		basicTwo bt = new basicTwo();
		bt.IteratorList();


	}

}
class basicTwo
{
	public void IteratorList() 
	{
		/*List Iterator can be used only for List implemented classes i.e = Array list , LinkedList, Vector, Stack   */
		
		ArrayList tm = new ArrayList();
		
		tm.add("Manoj");
		tm.add("Rajshree");
		tm.add("shubham");
		tm.add("kia");
		
		
		ListIterator li = tm.listIterator(); //need to import ListIterator interface....import java.util.ListIterator;
		
		System.out.println("Using listIterator() We Fetch a value");
		
		while(li.hasNext()) // .hasNext()(used just like a condition) method  Returns true if the iteration has more elements.
		{
			System.out.println(li.next()); // .next() method Returns the next element in the iteration.
		}
		
		/* here for reversing the value we must first need to run forword itration then its possible otherwise not*/
		
		System.out.println("**********************");
		System.out.println("Reverse the value: ");
		
		while(li.hasPrevious()) // .hasPrevious() method Returns the previous element in the list and moves the cursor backwards position. 
		{
			System.out.println(li.previous()); // .previous() method the previous element in the list
			
		}
		
		
	} 
	
}
