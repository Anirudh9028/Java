package Ashish;

public class arth2 {

	public static void main(String[] args) {
		
		addnumbers add = new addnumbers();
		addnumbers sub = new addnumbers();
		
		add.sum();
		sub.minus();
		
		
	}
}
class addnumbers{
	int a = 20,b=30,c;
	
	void sum() {
		c = a+b;
		System.out.println("add "+c);
	}
	
	void minus() {
		c = a-b;
		System.out.println("add "+c);
	} 
		
} 
		
		
	


