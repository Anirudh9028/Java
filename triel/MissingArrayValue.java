package triel;

class MissingArrayValue
{
	public static void main (String [] arg)
	{
		/*Array Should not have duplicates
		 Value Should Be In range*/
		
		int a[]= {1,2,3,4,6};
		
		/*Do sum Of Array a*/
		 int sum =0;
		for(int i =0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of Array elements: "+sum);
		
		int rangeSum = 0;
		
		for(int i=1;i<=6;i++)
		{
			rangeSum=rangeSum+i;
		}
		
		System.out.println("Sum of range elements: "+rangeSum);
		
		int missvalue= rangeSum-sum;
		
		System.out.println("Missing value: " + missvalue);
		
		
		
	}

}







