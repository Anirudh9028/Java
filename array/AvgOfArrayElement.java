package array;

public class AvgOfArrayElement 
{

	public static void main(String[] args) 
	{
		double Array [] = {16,1,12,45,26,47,78,778};
		
		double sum = 0;
		
		for(int i =0;i<Array.length;i++)
		{
			sum=sum+Array[i];
		}
		System.out.println("Sum Of Array:"+ sum);
		
		System.out.println("Avarage Of Array:"+ sum/Array.length);

	}

}
