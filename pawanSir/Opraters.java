package pawanSir;

public class Opraters {

	private static final Boolean True = null;

	public static void main(String[] args) 
	{
		/*   Arithmetic operators = (+),(-),(*),(/),(%)   */
		
		int a= 10;
		int b= 20;
		
		boolean p = true;
		boolean q = false;
		
	
		System.out.println("Arithmetic operators:"+"\n");
		System.out.println("a + b = " +(a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = "+ (a*b));
		System.out.println("a / b = "+ (a/b));
		System.out.println("a % b = "+ (a%b)+"\n");
		
		/*Relational Operators = (<),(>),(<=),(>=),(==),(!=)*/
		
		System.out.println("Relational Operators: Return Boolean value"+"\n");
		System.out.println("a < b = " + (a<b));
		System.out.println("a > b = " + (a>b));
		System.out.println("a <= b = " + (a<=b));
		System.out.println("a >= b = " + (a>=b));
		System.out.println("a == b = " + (a==b));
		System.out.println("a != b = " + (a!=b)+"\n");
		
		/* Logical operators = (&&),(||),(!)*/
		System.out.println("Logical operators: Return Boolean value "+"\n");
		System.out.println("p && q = "+(p && q));
		System.out.println("p || q = "+(p || q));
		System.out.println("!p = "+(!p));
		System.out.println("!q = "+(!q)+"\n");
		
		/* Assignment operators = (+=),(-=),(*=),(/=)
		 * if value is more than one then Use Assignment operator */
		
		
		
		System.out.println("Assignment operators\n");
		System.out.println("(a=a+b) a+=b:"+(a+=b));
		System.out.println("(a=a-b) a-=b:"+(a-=b));
		System.out.println("(a=a*b) a*=b:"+(a*=b));
		System.out.println("(a=a/b) a/=b:"+(a/=b)+"\n");
		
		
		/*Increment And Decrement (++),(--)
		 * if value is Equal to 1 then use increment and decrement operator*/
		System.out.println("Increment And Decrement\n");
		System.out.println("a++ = "+(a++));
		System.out.println("b++ = "+(b++));
		
		
		
		
		
		
		

	}

}
