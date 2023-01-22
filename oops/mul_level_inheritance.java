package oops;
/* in multiple-level inheritance gernally we do multiple level inheritance,
 * means sub class inherited super class propreties,And sub class_2 inherited subclass propreties...
 * so indirectly sub class_2 inherites both  super class + sub class propreties
 * */
public class mul_level_inheritance {

	public static void main(String[] args) 
	{
		child_2 ch = new child_2();
		 ch.Parent();
		 
		 ch.Child();
		 
		 ch.Child_2();
		 
		 System.out.println("\nthis is multileve inherihence example");
		
	}

}
class parent 
{
	public void Parent() 
	{
		System.out.println("its me parent class");
	}
}
class child_1 extends parent  
{
	public void Child () 
	{
		System.out.println("its me child one");
	}
}
class child_2 extends child_1
{
	public void Child_2() 
	{
		System.out.println("child_2 say hii");
	}
}
