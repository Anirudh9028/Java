package wrapperAndSingleton;

/*
 * Wrapper class -> primitive date type converted into Object format
 * boolean -> Boolean
 * char -> Character
 * byte -> Byte
 * short -> Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 */

public class wrapper {

	public static void main(String[] args)
	{
		/*valueOf ()-Return a Wrapper class object holding the specified primitive type value. 
		 parseInt ()-Retrieves the primitive data type of a specified String.*/
		System.out.println("Convert Object Into Primitive data type\n");
		String s1 = "45";
		String s2 = "5";
		
		System.out.println("Before Convert Object Into Primitive data type be like: "+(s1+s2));
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println("After Convert Object Into Primitive(int) data type be like: "+(a+b));
		
		double c = Double.parseDouble(s1);
		double d = Double.parseDouble(s2);
		
		System.out.println("After Convert Object Into Primitive(Double) data type be like: "+(c+d));
		
		
		/*Autoboxing (without calling any external method) primetive data type convert into object*/
		int e = 65;
		Integer i = e;
	
		System.out.println(i);
		
		/*Do it in normal way know as boxing(through method calling)*/
		int f = 78;
		
		String l = Integer.toString(f);
		System.out.println(l+3);
		
		/* unboxing = Wrapper class object into primitive data type*/
		/*Unboxing*/
		
		Integer un = 100;
		
		int unc= un.intValue();
		System.out.println(unc);
		
		/*Auto unboxing*/
		 Integer aun =200;
		 
		 int aunc = aun;
		 System.out.println(aunc);
		
		
		
		
		
		
		
	}
		


}



