package wrapperAndSingleton;

/*In Java, Singleton is a design pattern that ensures that a class can only have one object.

To create a singleton class, a class must implement the following properties:

Create a private constructor of the class to restrict object creation outside of the class.
Create a private attribute of the class type that refers to the single object.
Create a public static method that allows us to create and access the object we created. 
Inside the method, we will create a condition that restricts us from creating more than one object.*/

public class singleeton {

	
	public static void main(String[] args) 
	{
		 Database db1;

	      // refers to the only object of Database
	      db1= Database.getInstance();
	      
	      db1.getConnection();
	}

}
class Database {
	   private static Database dbObject;//create class object

	   private Database() // constructor make a private so no one can access this out side the class
	   {      }

	  // The static class type method getInstance() returns the instance of the class to the outside world.
	   public static Database getInstance() 
	   {

	      // create object if it's not already created
	      if(dbObject == null) {
	         dbObject = new Database();
	      }

	       // returns the singleton object
	       return dbObject;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}

	
	

