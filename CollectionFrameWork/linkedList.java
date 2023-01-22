package CollectionFrameWork;
import java.util.Collections;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) 
	{
		LinkedList <String> la = new LinkedList<String>();
		
		la.add("Kolhapur");
		la.add("Pune");
		la.add("Satara");
		la.add("Mumbai");
		la.add("Karad");
		
		
		System.out.println(la);
		
		la.addFirst("Thane");
		la.addFirst("Solapur");
		
		System.out.println(la);
		
		Collections.sort(la);
		System.out.println(la);
		
		System.out.println("get First: "+ la.getFirst());
		System.out.println("Get last: "+ la.getLast());
		System.out.println("With index 2: "+la.get(2));
		
		/*
		.addFirst()    = 	Adds an item to the beginning of the list.	
		.addLast() 	   = 	Add an item to the end of the list	
		.removeFirst() =     Remove an item from the beginning of the list.	
		.removeLast()  =     Remove an item from the end of the list	
		.getFirst()    = 	Get the item at the beginning of the list	
		.getLast()     =     Get the item at the end of the list*/
		
	}

}
