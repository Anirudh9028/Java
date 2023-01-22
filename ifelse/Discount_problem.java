
//Q A shop will give discount 10% if the cost of the product Quantity is more than 1000
// ask user for product quantity, 1 product cost is 100 rs
// judge and print the total cost of the product
//


package ifelse;
import java.util.*;
public class Discount_problem
{
	static void discount10(double Q) 
	{
		double Quantity_cost = Q*100;
		
		if(Quantity_cost>=1000)
		{
			double discount = (Quantity_cost)*(0.1);
			
			double product_price = (Quantity_cost) - (discount);
			
			System.out.println("Total cost after 10% discount is: "+ product_price);
		}
		else 
		{
			System.out.println("Total cost is: "+ Quantity_cost );
		}
		
	}

	public static void main(String[] args)
	{
		double product_quantity;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("one quantity of product is 100 rs\nEnter quantity of product: ");
		product_quantity = sc.nextDouble();
		
		discount10(product_quantity);

	}

}
