package CollectionFrameWork;
import java.util.ArrayList;

public class ListMethodDemo 
{

	public static void main(String[] args) 
	{
		a lt = new a();
		lt.listmethods();

	}

}
class a
{
	public void listmethods() 
	{
		ArrayList <String>al =new ArrayList<String>(); // Whole list object treated as String using this <String>
		
		
		System.out.println(".add() using add method we add element in list ");
		
		al.add("kia");
		al.add("Hyundai");
		al.add("Ford");
		al.add("Tata");
		
		System.out.println(al);
		
		al.add(1,"Honda City"); // using Indext value We can add element in list at perticular index postioning 
		System.out.println("");
		System.out.println("After adding Honda City at 1 Index position");
		System.out.println(al);
		
		System.out.println("");
		System.out.println("using .remove(Index Value), remove the perticular indexobject (Hyundai)");
		al.remove(2);
		System.out.println(al);
		
		System.out.println("");
		System.out.println("Using .set(Index Value) Method modify exsiting indexobject (Hyundai)");
		al.set(0, "Mahindra");
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
