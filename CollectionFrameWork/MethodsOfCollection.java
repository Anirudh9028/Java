package CollectionFrameWork;

import java.util.ArrayList;  // need to import array list from util pckage

public class MethodsOfCollection 
{

	public static void main(String[] args) 
	{
		ArrayListDemo ad = new ArrayListDemo();
		
		ad.BasicMethod();

	}

}

class ArrayListDemo
{
	public void BasicMethod() 
	{
		ArrayList  al = new ArrayList  (); // Create object of ArrayList class...
		
		/*Using .add (); method we add element in list
		 * Basically whatever we added element in the list his treated as object
		 * Duplicacy allow */
		
		al.add("Anup");
		al.add("Anirudh");
		al.add("vishakha");
		al.add("Manoj");
		al.add("Rajshree");
		al.add(911); 
		
		ArrayList al2 = new ArrayList();
		
		al2.add(12456);
		al2.add(987);
		al2.add(911);
		al2.add(563);
		
		
		System.out.println("1) Using . add(); method We create an Array List Of Al:\n"+ al);
		System.out.println(" ");
		System.out.println("1) Using . add(); method We create an Array List Of Al2:\n"+ al2);
		
		System.out.println(" ");
		al.addAll(al2);
		System.out.println("2) using .addAll(); We Add al2 list in al list (al + al2)\n"+al);
		
		System.out.println(" ");
		System.out.println("3) Using .contains(); We Verify value (anup) present in list or not Ans Would in Boleen Value:\n"+ al.contains("Anup"));
		
		System.out.println(" ");
		System.out.println("3) Using al.containsAll(al2); We Verify list1 present in list2 or not Ans Would in Boleen Value:\n"+ al.containsAll(al2));
		
		System.out.println(" ");
		System.out.println("4) using .isEmpty(); We Verify List (al2) Empty Or not Ans Would in Boleen Value:\n "+ al2.isEmpty());
		
		System.out.println(" ");
		System.out.println("5) Using .size(); We verify the list Size:\n "+ al.size());
		
		System.out.println(" ");
		System.out.println("6) Array list of al2\n "+al2+"\n");
		al2.remove(0);
		System.out.println("6) Using .remove(); Remove the value from list,In case of numeric data we using indexing value(al2.remove(0)):\n "+ al2);
		
		System.out.println(" ");
		System.out.println("6) Array list of al\n "+al+ "\n");
		al.remove("Anup");
		System.out.println("6) Using .remove(); Remove the value from list,In case of non-numeric data we using value(al.remove(Anup)):\n "+ al);
		
		System.out.println("******************************************************************* ");
		ArrayList al3 = new ArrayList();
		
		al3.add("Anup");
		al3.add("Anirudh");
		al3.add("vishakha");
		
		ArrayList al4 = new ArrayList();
		al4.add("Manoj");
		al4.add("Rajshree");
		al4.add("Anup");
		al4.add("Anirudh");
		
		System.out.println(" ");
		al3.removeAll(al4);
		System.out.println("6) Using .removeAll(); Remove the duplicate value from list(al3),After compairing list(al4)..(al3.removeAll(al4);):\n "+ al4 );
		
		System.out.println(" ");
		al3.clear();
		System.out.println("7) Using .clear(); Remove the All value from list(al3):\n " );
		System.out.println("7) We Verify List (al3) Empty Or not Ans Would in Boleen Value:\n"+ al3.isEmpty() );
			
	}
}
