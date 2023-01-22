package oops;


abstract class fruit // bz of abstract method is present in this class that why we declear whole class as abstract
{
	public abstract void test_of_fruit(); // abstract method 
	
	 public static void cl_ab() // non absract method
	 {
		 System.out.println("its a abstruct class");
	 }
}

class Lemon_test extends fruit // class of Lemon_test inheritance propreties of class fruit(parent class) using extends keyword
{
	@Override
	public void test_of_fruit() // cl inherit method of fruit(parent class)
	{
		System.out.println("Test of lemon is Sour");
	}
	
}

class Mango_test extends fruit // class of Mango_test inheritance propreties of class fruit(parent class) using extends keyword
{
	@Override
	public void test_of_fruit() // cl inherit method of fruit(parent class)
	{
		System.out.println("Test of Mango is Sweet");
	}
	
}

public class Concept_abstract {

	public static void main(String[] args) 
	{
		// create class object and call a method
		
//		Lemon_test lt=new Lemon_test(); // create class object 
//		lt.test_of_fruit();              // and call a method
//		
//		Mango_test mt = new Mango_test();
//		mt.test_of_fruit();
		
		// OR
		// using parent class name create object
		
		fruit lt=new Lemon_test();
		lt.test_of_fruit();
		
		fruit mt = new Mango_test();
		mt.test_of_fruit();
		
		fruit.cl_ab(); // cl non-abstract method in abstract class
		
		
		
		

	}

}
