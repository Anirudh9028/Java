package array;

public class ArrayBasic 
{

	public static void main(String[] args) 
	{
		//DemoOne.OneDimenional();
		
		//DemoOne.TwoDimensionalMatrixArraymMethodOne();
		
		//DemoOne.TwoDimensionalMatrixArraymMethodSecond();
		
		//DemoTwo.TwoDimensionalJaggedArray();
		
		DemoThree.ThreeDimensionalJaggedArray();

	}

	

}
class DemoOne
{
	public static void OneDimenional()
	{
		int[] a = {10,20,30,40};
		
		System.out.println("One Dimenional Array Example: ");
		
//		for(int i =0; i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		for(int i : a)
		{
			System.out.println(i);
		}
	}
	
	
	public static void TwoDimensionalMatrixArraymMethodOne() 
	{
		/* those Array create a same column's with respect to row's know as matrix Array (Column size == Row's Size) */
		
		int[][] a = new int[2][3]; // Declare
		
		/*initionallizise*/
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		/*retrive*/
		
		for(int i =0;i<a.length;i++) 
		{
			for(int j =0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void TwoDimensionalMatrixArraymMethodSecond() 
	{
		/*Declaration + initionalision at one line*/
		
		int[][] a = {{10,20,30},{40,50,60}};
		
		System.out.println("Two Dimensional Matrix Array Example: ");
		
		for(int i =0;i<a.length;i++) 
		{
			for(int j =0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
				
		
	}
}
class DemoTwo
{
	
	public static void TwoDimensionalJaggedArray() 
	{
		/* those Array are not create a same column's with respect to row's know as Jagged Array (Column size != Row's Size) */
		
		int[][] a = {{10,20,30},{40,60}};
		
		System.out.println("Two Dimensional Jagged Array: ");
		
		for(int i =0;i<a.length;i++) 
		{
			for(int j =0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
	
	
}

class DemoThree
{
	public static void ThreeDimensionalJaggedArray() 
	{
		int[][][] a = {{{10,20},{40,50,60,70,80},{90,100,110}}};
		
		System.out.println("Three Dimensional Jagged Array:\n ");
		
		for(int i = 0;i<a.length;i++) 
		{
			for(int j = 0;j<a[i].length;j++) 
			{
				for(int k=0;k<a[i][j].length;k++) 
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}
