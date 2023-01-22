package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Try 
{

	
	
	public static void main(String asd[]) {
		
		ArrayList<String> lk = new ArrayList<String>();
		
		lk.add("abhghg");
		lk.add("bcv");
		lk.add("hjk");
		lk.add("gfd");
		lk.add("rty");
		
		int count = lk.size();
		
//		for(int i=0;i<count;i++) 
//		{
//			System.out.println(lk.get(i));
//		}
		
		

		ListIterator jk =lk.listIterator();
		
		while(jk.hasNext()) 
		{
			System.out.println(jk.next());
		}
		
		while(jk.hasPrevious()) 
		{
			System.out.println(jk.previous());
		}
	 
	}
	
}
