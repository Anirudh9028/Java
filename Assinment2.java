

public class Assinment2
{

	public static void main(String[] args) 
	{
		prog pr =new prog();
		dncr dr = new dncr ();
		sngr sg = new sngr();
		
		pr.learn();
		dr.learn();
		sg.learn();

	}

}

interface person1
{
	 void learn() ;
	
}
class prog implements person1
{
	@Override
	public void learn() 
	{
		System.out.println("I am programmer and i am learning coading");
	}
}
class dncr implements person1
{
	@Override
	public void learn() 
	{
		System.out.println("I am dancer and i am learing dancing step ");
	}
}
class sngr implements person1
{
	@Override
	public void learn() 
	{
		System.out.println("I am singer and I am learing Tunes and music song");
	}
}