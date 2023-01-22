package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Comparable & Comparator -> both are interface and used for Sorting
* 
* 1) comparable -> single sorting || 1) Comparator -> Multiple sorting 
* 2) compareTo() method           || 2) compare() method
* 3) java.lang package            || 3) java.util package
* 4) Collections.sort(list/set)   || 4) collections.sort(List,comparator)
* 
*/


public class comparator {

	public static void main(String[] args) 
	{
		ArrayList<students> list = new ArrayList<students>();
		
		list.add(new students(1001,"Ashish", 30));
		list.add(new students(1002,"Vishal",28));
		list.add(new students(1003,"Tarun", 25));
		
		System.out.println("Sorting based on name\n");
		Collections.sort(list, new NameComparator());
		
		for(students s1 : list) {
			System.out.println(s1.rollNo+ " "+s1.name+ " " +s1.age);
		}
		
		

	}

}
class students {
	int rollNo;
	String name;
	int age;
	
	students(int rollNo, String name, int age){
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
}

class NameComparator implements Comparator <students> // need to import java.util.Comparator
{
	public int compare(students s1, students s2) // Using compare() method with argument here s1 and s2 belong same class bt different object 
	
	{
		return s1.name.compareTo(s2.name); // use compareTo method  
	}
}