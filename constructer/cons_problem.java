package constructer;
import java.util.*; // import all(*) pckg from util class

public class cons_problem {
	
	double length_of_squre ; // global variable
	double width_of_squre;
	
	public cons_problem(double len,double width) { // define parametric construter
		
		this.length_of_squre = len; // assing or initialize local variable to global variable
		this.width_of_squre = width;
		
	}
	void area() { // define method which is calculate area 
		
		 double area = (length_of_squre * width_of_squre) ;
		 
		 System.out.println("area of squre  : " + area);
	}
	
	
	

	public static void main(String[] args) { // define method 
		
		double length_of_squre , width_of_squre;
		
		Scanner area= new Scanner (System.in);
		
		System.out.println("put value of length : ");
		length_of_squre = area.nextInt();
				
		System.out.println("put value of length : ");
		width_of_squre = area.nextInt();
		
		cons_problem squre_Are = new cons_problem(length_of_squre , width_of_squre);
		
		//System.out.println(squre_Are.length_of_squre *squre_Are.width_of_squre);
		
		// OR
		
		squre_Are.area(); // call area method
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
