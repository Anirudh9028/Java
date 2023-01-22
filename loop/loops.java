package loop;

public class loops
{
	
	static void dowhile() 
	{
		
		int i = 1;//loop starting point(loop initialise)
		do 
		{
			int table = i*3; 
			System.out.println(table);
			i++; // i increment by 1
		}
		while(i<=10);
		//while(i<=0); // to check exact condition of do while
	}
	
	static void whilloop() // entry control loop
	{
		//int table 
		int i =1;
		while(i<=10) 
		{
			int table = i*3;
			System.out.println(table);
			i++;
		}
	}
	static void forloop() // entry control loop
	{
		int table ;
		
		for(int i=1;i<=10;i++) 
		{
			table = i*3;
			System.out.println("3*"+i+" = "+ table);	
		}
	}
	
	
	public static void main(String[]args) 
	{
		//forloop();
		
		whilloop();
		
		//dowhile() ;
	}

}
