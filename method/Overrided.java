package method;



public class Overrided {

	public static void main(String[] args) 
	{
		Overrided td = new boy();
		td.humans();
	}
	public void humans () 
	{
		System.out.println("humans");
	}

}
class boy extends Overrided
{

	@Override
	public void humans () 
	{
		System.out.println("boys");
	}

}
