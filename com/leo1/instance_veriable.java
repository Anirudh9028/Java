package com.leo1;

public class instance_veriable { // creat class

	public static void main(String[] args) { // creat main method
		
		static_variable.function(); // call another class function(method) in a same package
		
		instance_veriable abc = new instance_veriable(); // creat object(abc) of class to call non static function
		
		abc.instance();	// call non static Or instance  function = obj name + non-static function name (instance) 

	}
	
	void instance () 
	{
		System.out.println("instance or nonststic veriable say hii");
		
	}

}
