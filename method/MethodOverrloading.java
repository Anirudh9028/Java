package method;

class MethodOverrloading
{
	public static void main (String [] arg)
	{		
		plus nm = new plus();
		nm.add(23, 23);
	}
}
class plus
{
	public int add(int a, int b) 
	{
		
		int sum = a+b;
		System.out.println(sum);
		return sum;	
	}
	public long add(long x, long y) 
	{
		
		long sum = x+y;
		System.out.println(sum);
		return sum;	
	}
	public double add(double m, double n) 
	{
		
		double sum = m+n;
		System.out.println(sum);
		return sum;	
	}

}