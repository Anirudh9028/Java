package pawanSir;

import java.util.Scanner;

public class ConditionalStatement {
	
	
	
	public void ELSEIF(int n) 
	{
		
		int day =n;
		
		if(day == 1) 
		{System.out.println("monday");}
		
		else if(day == 2)
		{System.out.println("tuesday");}
		
		else if(day == 3)
		{System.out.println("wendday");}
		
		else if(day == 4)
		{System.out.println("thuesday");}
		
		else if(day == 5) 
		{System.out.println("frieday");}
		
		else if(day == 6) 
		{System.out.println("staturday");}
		
		else if(day == 7) 
		{System.out.println("saunday");}
		
		else if(day == n) {System.out.println("put value between 1 to 7 only");}
		
		
	}
	
	public void switchStatment(int num) 
	{
		
		int day = num;
		
		switch(day) 
		{
		
		case 1:  {System.out.println("monday");break;}
		case 2:  {System.out.println("tuesday");break;}
		case 3:  {System.out.println("wensday");break;}
		case 4: {System.out.println("thusday");break;}
		case 5: {System.out.println("frieday");break;}
		case 6: {System.out.println("staturday");break;}
		case 7: {System.out.println("sunday");break;}
		default :{System.out.println("put value between 1 to 7 only");}
		
		
		
		
		}
		
	}

	
	
	
	

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter day: ");
		int jk = sc.nextInt();
		
		ConditionalStatement gh = new ConditionalStatement();
		gh.ELSEIF(jk);
		//gh.switchStatment(jk);
		
		
	
	}
}