package string;

public class MethodString {

	public static void main(String[] args) 
	{
		strMethods ms = new strMethods();
		ms.strmethods();

	}

}
class strMethods
{
	public void strmethods() 
	{
		String s1 = "ANIRUDH";
		String s2 ="rahul";
		
		System.out.println("Strings Methods:............\n");
		
		System.out.println(".toLowerCase(): Convert into lowerCase: "+s1.toLowerCase());
		
		System.out.println(".toUpperCase(): Convert into UpperCase: "+s2.toUpperCase());
		
		System.out.println(".concat(): Concating two String: "+s1.concat(s2));
		
		System.out.println(".length(): Verify length of String: "+s1.length());
		
		String p = "  Ani  ";
		String q = "";
		
		System.out.println("Strings Methods:............\n");
		System.out.println(".trim(): Erase prefix And postfix widespace from String: "+p.trim());
		
		System.out.println(".isEmpty(): Verify String whethere Empty or not: "+q.isEmpty());
		
		System.out.println(".charAt(): Fetch the Second index character in the string: "+s1.charAt(2));
		
		System.out.println(".indexOf('h'): checking index number of string charator: "+s2.indexOf('h'));
		
		System.out.println(".equals(): verify two string value Same or not: "+s1.equals(s2));
		
		System.out.println(".replace(\"rahul\",\"omkar\")Replace one string value with another one: "+s2.replace("rahul","omkar"));
		
		String a = "ANIRUDH";
		String b = new String("anirudh");
		
		System.out.println("Strings Methods:............\n");
		
		System.out.println(".equalsIgnoreCase(b): verify two string value Same or not with exception of case sensetive: "+a.equalsIgnoreCase(b));
		
		System.out.println(".substring(2): Fetch required charactore from mentioning indexing: "+a.substring(2));
		
		System.out.println(".substring(2,6): Fetch required charactore From with ending mentioned indexing: "+a.substring(2,6));
		System.out.println("Strings Methods:............\n");
		
		
		// join method used for to join a charatre or string using delimeters("-","1","@","a")

		String js = String.join("*","welcome","To","Java");
		
		System.out.println("join method(delimeters,characters):"+js);
		
		//Convert primitive type into string
		
		int a1 = 10;
		float b1 = 10.2f;
		
		String str1 = String.valueOf(a1);
		String str2 = String.valueOf(b1);
		System.out.println("add two string: "+(str1+str2));
		System.out.println("Strings Methods:............\n");
		
		//the  String object is added to the pool and a reference to this String object is returned.
		
		System.out.println("intern change object................ ");
		
		String m = "Anup"; // string literals(pool)
		
		String n = new String("Anup"); // String object (Heap memory)
		
		String o = n.intern(); // intern will take value of object and put in pool where its match, and ref the veriable as well
		
		System.out.println("Without intern: "+ (m==n));
		System.out.println("With intern: "+ (o==m));
		System.out.println("Strings Methods:............\n");
		
		
		// Split method
		System.out.println("Split method:............\n");
		String z = "Welcome To java";
		
		String [] split = z.split(" ");
		
		for (String w : split) 
		{
			System.out.println(w );
		}
		System.out.println("Strings Methods:............\n");
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}