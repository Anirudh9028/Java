package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Comparable & Comparator -> both are interface and used for Sorting
* 
* 1) comparable -> single sorting || 1) Comparator -> Multiple sorting 
* 2) compareTo() method           || 2) compare() method
* 3) java.lang package            || 3) java.util package
* 4) Collections.sort(list/set)   || 4) collections.sort(List,comparator)
* 
*/

public class comparableOne 
{

	public static void main(String[] args) 
	{
		
		// list assign to student constructor<student>
		
		ArrayList <student>list =new ArrayList<student>();
		
		
		/* adding element in to list
		 * create parametric student constructor object (new student()) and assign value*/
	
		list.add(new student(123,"ashish",30));
		list.add(new student(113,"ayush",29));
		list.add(new student(143,"mavasha",22));
		
		
		/* Colletions.sort ...> sort a list based age criteria, 
		 * bz we declared method to be sort   */
		
		Collections.sort(list); 
		
		for(student st : list) // used to retrieve the data
		{
			System.out.println(st.rollNo+" "+ st.name+" "+st.age);
		}

	}

}
class student implements Comparable <student> // Call Comparable interface and pass student constructor(object)
{
	int rollNo;
	String name;
	int age;
	
	
	student(int rollNo,String name, int age) // parametric constructor used for set the values
	{
		this.rollNo = rollNo; // assign value
		this.name = name;
		this.age =age;
	}
	
	/*compareTo..> used to sort any single variables among others, 
	 * here we selected age 
	 * Create another object of dummy student class and compare with original once
	 * using compareTo method*/
	
	public int compareTo(student st) // return data type must be same as comparable variable here(int)
	{
		if(age== st.age) // here we selected age To be Compare
		{
			return 0;        // Equal Output ....>0
			
		}
		else if(age>st.age) 
		{
			return 1;          //Greater....>1
		}
		else 
		{
			return -1;          //Lesser...>-1
		}
	}
}