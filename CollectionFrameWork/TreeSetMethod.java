package CollectionFrameWork;
import java.util.TreeSet;
public class TreeSetMethod {

	public static void main(String[] args) 
	{
		TreeSet <Integer> num = new TreeSet<Integer>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);// Only one kind of data need to be store i.e String,Integer
		num.add(5);
		num.add(1);// Duplicacy not Allowed
		
		System.out.println(num); // Follow Acesending Order
		
		System.out.println(num.higher(4)); //. higher(element) return only one element, which is greater than specified element..5
		System.out.println(num.lower(5)); // .lower(e)return only one element, which is less than specified element..4
		System.out.println(num.ceiling(4));//.ceiling(e) return  one element, which is greater than equal to specified element..4
		
		
		
	}

}
