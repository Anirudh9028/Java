package oops;
// fully encapsulation program bz global variable declear as private


class Fully_Encapsulation // java bean example
{
	 private int value;  // global veriable with acsses modifier private
	 // int value; // global veriable without acsses modifier
	
	public void setvalue(int x) // setter mothod to assing value for private global veriable
	{
		this.value=x;
	}
	public int getvalue() //getter method to print value of private global veriable
	{
		return value;
	}
}



public class Encapsulation {

	public static void main(String[] args) 
	{
		Fully_Encapsulation obj = new Fully_Encapsulation();
		
//		obj.value = 100;  // to assing global veriable value
//		System.out.println(obj.value); //to call global veriable value
		
		obj.setvalue(100); // to call + assign value to setvalue method
		System.out.println(obj.getvalue());	//to call + get value from getvalue method

	}

}


