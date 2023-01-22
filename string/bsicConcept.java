
package string;
/* 1) why string is immutable  reseon = str concept2 
 * 2) why differnt veriable refer same value = str concept2*/

class basic
{
	public void strConcept1() 
	{
		String a ="anirudh";  //string is immutuable....
		System.out.println(a);
		
		a=a.concat("ingvale"); //if we try to force them to changes then it will..create differnt object with same variable name(a)
		//System.out.println(a); // and keep previous veriable value (anirudh) as it is without any veriable name
	}
	
	public void strConcept2() 
	
	{ /* here both s1 and s2 content same value ie.omkar.. in that scenario s2 wont create his differnt object 
	     for the value which is same as s1...instent of that refer same object(memory location)
	     purpuse :- to save the memory space from duplicy or same value...and make software efficient */
		
		String s1="omkar";
		String s2="omkar";
		System.out.println(s1);
		
		/* consider here we wanted to add another value in exesting one.....then also we indirectly try to change s1 value
		 * so its quite unfair with s1 ...to avoid such type of condition....java make it immutable  */
		
		s2.concat("jagdale");
		System.out.println(s2);
				
	}
	
	public void strType()
	
	{/* there are basically two types one is literal and second one is string with new keyword*/
		
		String literals = "String with : literals"; // literals means present in double qutoes ""
		
		String nw_kyword = new String ("string with new keyword"); //string with new keyword
	}
	
	
}


class DiffOperatorAndMethod

{
	public void Opertaor() 
	
	{  
		/*Generally (==) operator used for comparing memory location(address) of the two veriable */
		
		String r = "Anup";
		String s = "Anup"; 
		
		String d = new String("Anup"); 
		
		String d1 = new String("Anup");
		
		System.out.println(r==s); // both r and s are store in same memory location in "String constant pool",....so result is True
		
		System.out.println(r==d); // r store in "String constant pool" where as d store in heap memory location,...so result is False
		
		System.out.println(d1==d); // each time create diiffrent object for string  in heap memory if contents same values or not....so result is false
	}
	
	public void equalMethod() 
	{
		/*(.equal) method is compare context value between two veriables*/
		
		String e = "Amit"; // e veriable store in String constant pool
		
		String t = new String("Amit"); // t veriable store in heap memory
		
		String j = new String("Suraj");
		
		System.out.println(e.equals(t)); // same context value bt different memory location ...so result is true
		
		System.out.println(t.equals(j)); // both t & j presnt in heap memory bt at different memory location ..bt context also differnt ..so Result is False			
	}
	
	public void compairMethod() 
	{/*The String class compareTo() method compares values lexicographically and returns an integer value  
	that describes if first string is less than, equal to or greater than second string.
	lexicographical order (also known as lexical order, or dictionary order) is a generalization of the alphabetical order of the dictionaries*/
		
		   String s1="Sachin";  
		   
		   String s2="Sachin";
		   
		   String s3="Natan";
		   
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 ) 
	}
}


public class bsicConcept {

	public static void main(String[] args) 
	{
		//basic bs =new basic();
		
		//bs.strConcept1();//string is immutuable....if we try to force them to changes then it will..create diiffernt object with same variable name(a) 

		//bs.strConcept2(); // make software efficient
		
		//strMethods sm = new strMethods(); // few methods used in java
		
		//sm.strmethods();// methods call
		
		DiffOperatorAndMethod df = new DiffOperatorAndMethod();
		
		//df.Opertaor();
		//df.equalMethod();
	   df.compairMethod();
		
		
		
		
		
		
		
		
		
		
	}

}
