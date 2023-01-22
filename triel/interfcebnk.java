package triel;

public class interfcebnk {

	public static void main(String[] args) 
	{
		sbi b = new sbi();
		b.rate_of_intrest();
		
		pnb pb = new pnb();
		pb.rate_of_intrest();
		

	}

}
interface Bank
{
	void rate_of_intrest();
}
class sbi implements Bank
{
	public void rate_of_intrest() 
	{System.out.println("its work");}
}
class pnb implements Bank
{
	public void rate_of_intrest() 
	{
		System.out.println("pnb");
	}
}
