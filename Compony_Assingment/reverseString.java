
package Compony_Assingment;

public class reverseString {

	public static void main(String[] args) 
	{
		
		a sd=new a();
		sd.reverseDemo1();	
		//sd.Demo2();
	}
}
class a
{
	public void reverseDemo1() 
	{
        String s = "i am anirudh";
		
		int length = s.length();
		
		int exactLength = length-1;
		
		String rev = "";
		
		for(int i= exactLength;i>=0;i--) 
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
	public void Demo2() 
	{
		String s = "Anirudh";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		
		
		System.out.println(sb.reverse());
	}
	
}