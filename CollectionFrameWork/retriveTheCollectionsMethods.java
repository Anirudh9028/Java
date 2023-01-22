package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class retriveTheCollectionsMethods 
{
	public static void main(String[]arg) 
	{
		methods md = new methods();
		
		md.WayOne();
		md.WaySecond();
	}
	
	
}
class methods
{
	public void WayOne() 
	{
		ArrayList<String> tm = new ArrayList<String>();
		
		tm.add("Manoj");
		tm.add("Rajshree");
		tm.add("shubham");
		tm.add("kia");
		
		System.out.println("Using Simple way (System.out.println):-  "+tm);
		System.out.println("Using tm.get(0) method fetch indexing value: "+tm.get(0));
		System.out.println(" ");
		
		Iterator<String> it = tm.iterator(); // need to import Iterator interface.....import java.util.Iterator;
		
		System.out.println("Using iterator() We Fetch a value (Forword iteration)");
		
		while(it.hasNext()) // .hasNext()(used just like a condition) method  Returns true if the iteration has more elements.
		{
			System.out.println(it.next()); // .next() method Returns the next element in the iteration.
		}
	
		System.out.println("");
		System.out.println("Using For loop We Fetch a value (Forword iteration)");
		
		for(int i =0;i<tm.size();i++) // size() method used for knowing length Array list 
		{
			System.out.println(tm.get(i)); // get() method used for getting the value from Array List
		}		
		
	}
	public void WaySecond() 
	{
		ArrayList tm = new ArrayList();
		
		tm.add("Manoj");
		tm.add("Rajshree");
		tm.add("shubham");
		tm.add("kia");
		
		ListIterator li = tm.listIterator(); //need to import ListIterator interface....import java.util.ListIterator;
		
		System.out.println("");
		System.out.println("Using listIterator() We Fetch a value (Forword iteration)");
		
		while(li.hasNext()) // .hasNext()(used just like a condition) method  Returns true if the iteration has more elements.
		{
			System.out.println(li.next()); // .next() method Returns the next element in the iteration.
		}
		
		/* here for reversing the value we must first need to run forword itration through ListIterator then its possible otherwise it is not*/
		
		System.out.println("**********************");
		System.out.println("Reverse the value (Reverse iteration): ");
		
		while(li.hasPrevious()) // .hasPrevious() method Returns the previous element in the list and moves the cursor backwards position. 
		{
			System.out.println(li.previous()); // .previous() method the previous element in the list
			
		}
		System.out.println("*****here for reversing the value we must first need to run forword itration then its possible otherwise it is not******");
			
		
		
	}
	
}
