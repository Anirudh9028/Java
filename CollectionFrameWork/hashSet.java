package CollectionFrameWork;
import java.util.HashSet;
import java.util.TreeSet;

public class hashSet {
	/*Dont Allow Duplicey
	 * do not Flow Insertion order*/

	public static void main(String[] args) 
	{
		// Only one kind of data need to be store i.e = String,Integer,objectEtc
		HashSet<Object>  set=new HashSet<Object>();
	
		set.add("Shila");
		set.add("sofie");
		set.add("Malti");
		set.add("Vera");
		set.add("Jagruti");
		set.add("Kavya");
		set.add("Kavya"); //not allowed duplicy 
		set.add(4651);
		System.out.println(set);
		
		System.out.println("Tree Set**************");
		
		// by default Ascending Oder
//		TreeSet<String> ts = new TreeSet<String>();
//		
//		ts.addAll(set);
//		System.out.println(ts);

	}

}
