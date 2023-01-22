package Compony_Assingment;

import java.util.Scanner;
public class withoutUsingMultipleoperator
{

		int prod =0;

		public void prod(int a , int b)
		{

			for(int i=0;i<
					b;i++)
			{

				prod = prod+a;

			}
			System.out.println(prod);

		}



		public static void main(String []arg)
		{

			Scanner sc =new Scanner(System.in);

			System.out.println("enter number a:");
			int p =sc.nextInt();

			System.out.println("enter number b:");
			int q = sc.nextInt();


			withoutUsingMultipleoperator mk= new withoutUsingMultipleoperator();
			mk.prod(p,q);
		}



	}

