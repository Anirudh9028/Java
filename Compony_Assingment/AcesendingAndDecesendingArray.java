package Compony_Assingment;



public class AcesendingAndDecesendingArray {

	public static void main(String[] args) 
	{

		int a [] = {12,8,14,18,16};

		int temp;
		for(int i= 0;i<a.length;i++) 
		{
			for(int j= i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) // for for desecending order = if(a[i]<a[j])(max to min)
				{
					temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

		for (int i = 0;i < a.length;i++) 
		{
			System.out.print(a[i] +" ");
		}
		
		System.out.println("");
		for (int i = a.length-1;i >=0;i--) 
		{
			System.out.print(a[i] +" ");
		}
		

	}

}

/*
 * int a[]={45,78,96,75,26};
int temp;

for(int i = 0;i<a.length;i++)
{

for(int j= i+1;j<a.length;j++)
{

if(a[i]<a[j])
{
temp = a[i];
a[i] = a[j];
a[j] = temp;

}

}

}
System.out.println("Ascending");
for(int i= 0;i<a.length;i++)
{System.out.print(a[i]+" ");}

System.out.println("Dscending");
for(int i = a.length;i>=0;i--)
{System.out.print(a[i]+" ");}
 */




