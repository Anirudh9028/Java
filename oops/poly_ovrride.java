package oops;
/*When a polymorphism receives the information to call a method and that to be in runtime, then it is called runtime polymorphism
 * 
 * */


class A
{
	void identifion_class() 
	{
		System.out.println("Super class say hii");
		
	}
}
class b extends A
{
	@Override
	void identifion_class() 
	{
		//super.identifion_class();      // when we need to call super class method
		System.out.println("Sub class say hii");		
	}	
	
}

public class poly_ovrride {

	public static void main(String[] args) 
	{
		A obj = new b();
		
		obj.identifion_class();
	}

}
