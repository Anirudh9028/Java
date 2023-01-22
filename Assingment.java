
public class Assingment {

	public static void main(String[] args)
	{
		
		programmer pr = new programmer();
		dancer dr = new dancer ();
		singer sr = new singer();
		
		pr.programerinfo();
		dr.dancerinfo();
		sr.singerinfo();	
	}

}
class person 
{
	public void learn() 
	{
		System.out.println("i am learning... ");
	}
	public void walk()
	{
		System.out.println("i am walking..");
	}
	public void eat () 
	{
		System.out.println("I am eating Food"+"\n");
	}
}
class programmer extends person
{
	String name = "anirudh";
	String designation = "CEO";
	String CompanyName = "Google";
	
	
	public void programerinfo()

	{
		System.out.println("programmer name: "+name+"\n"+"Designation: "+designation+"\n"+"Company name: "+CompanyName+"\n");
		super.learn();
		super.walk();
		super.eat();
	}	
}
class dancer extends person
{
	String name = "omkar";
	String designation = "dancing teacher";
	String CompanyName = "Natraj dance Acadmy";
	
	
	public void dancerinfo()
	{
		System.out.println("dancer name: "+name+"\n"+"Designation: "+designation+"\n"+"Group name: "+CompanyName+"\n");
		super.learn();
		super.walk();
		super.eat();
	}
	
	
}
class singer extends person
{
	String name = "Shubham";
	String designation = "National Level Singer";
	String CompanyName = "T-series";
	
	
	public void singerinfo()
	{
		
		System.out.println("Singer name: "+name+"\n"+"Designation: "+designation+"\n"+"Band name: "+CompanyName);
		super.learn();
		super.walk();
		super.eat();
	}
	
}




















