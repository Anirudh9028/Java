package triel;

class SwapTwoNumber
{
	public static void main (String [] arg)
	{
		
		/*Swap method 1*/
		
		int a =10;
		int b=20;
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("Swap number With Using Third veriable: "+"a: "+a+"  "+"b:"+b);
		
		System.out.println("Swap Method 2************************************");
		
		/*Swap Method 2*/
		int x = 40;
		int y = 50;
		
		x= x+y; //90
		
		y = x-y;
		
		x = x-y;
		System.out.println("Swap number Without Using Third veriable: "+"x: "+x+"  "+"y:"+y);
		
		
		
		
		
		
	}
}







