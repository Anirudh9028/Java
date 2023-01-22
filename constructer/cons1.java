package constructer;

import java.util.*; // import all (*) util pckg

public class cons1 {  //define class name
			
			public static void main(String[] args) { //call main method body
				
			String first_name,last_name; // assign local variable with its data type
			long phone;
				
			Scanner sc = new Scanner(System.in); // create obj of scanner class (sc)
				
			System.out.println("enter first name: "); // print out msg for user
			first_name = sc.nextLine(); // store a user input data in variable (first_name)
				
			System.out.println("enter last name: ");
			last_name = sc.nextLine();
				
			System.out.println("enter phone n.o: ");
			phone= sc.nextInt();
				
			emp1 a =new emp1( first_name, last_name,phone);// create obj (a)of parametric constructor class
				
			a.information(); // cl the method inside the class with help of obj name
					

			}

}
class emp1{ // create a class
	
			String first_name; // create global variable with its type
			String last_name;
			long phone;
			
			emp1(String first_name,String last_name,long phone){ // create a local variable with its data type for store a value
				
				this.first_name = first_name; // whatever store value assign or initialize to global variable
				this.last_name = last_name;
				this.phone= phone;
				
			}
			void information() { // create method for print global variable value 
				
				System.out.println("first name:"+first_name+"\nlast name:"+last_name+"\nphone n.o:"+phone);
			}
		}

