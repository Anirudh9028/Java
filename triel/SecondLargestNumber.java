package triel;

class SecontLargestNumber
{
	public static void main (String [] arg)
	{
		int a[] = {2,7,9,8};
		int temp;
		for(int i = 0;i<a.length;i++)
		{
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]<a[j])/*Swap method*/
				{
					temp =a[i];
					a[i] = a[j];
					a[j] = temp;

				}
				

			}
			if(i==1){break;}
		}
		System.out.println("Second largest number: "+ a[1]);




	}

}







