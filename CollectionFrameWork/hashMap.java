package CollectionFrameWork;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) 
	{
		/*Need to mention key ,value type*/
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Maharastra", "Mumbai");
		hm.put("Delhi", "Delhi");
		hm.put("Andhra Pradesh", "Hyderabad");
		hm.put("Assam", "Dispur");
		hm.put("Bihar", "Patna");
		hm.put("Gujarat", "Gandhinagar");
		
		System.out.println(hm);
		
		System.out.println(hm.get("Maharastra"));
		
		
		
		/*Use the keySet() method if you only want the keys, 
		 And use the values() method if you only want the values:*/
		
		System.out.println("Get only key using .keySet()\n");
		for(String k:hm.keySet())
		{System.out.println(k);}
		
		System.out.println("Get only values using .values()\n");
		for(String l: hm.values()) 
		{System.out.println(l);}
		
		System.out.println("Get Keys values Pair \n");
		for(String m: hm.keySet()) 
		{System.out.println("Key :"+m+ " Value: "+hm.get(m));}
		
		System.out.println("********************************************");
		
	    HashMap<String, Integer> people = new HashMap<String, Integer>();


	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
		
		
		
		
	
		
		

	}

}
