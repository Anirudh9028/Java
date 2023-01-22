package constructer;

public class initialise_cons {
	
	String name;
	int age;
	
	
	
	public initialise_cons(String na, int ag){
		
		name = na;
		age  = ag;
	}

	public static void main(String[] args) {
		initialise_cons id1 = new initialise_cons("Ama" ,34);
		initialise_cons id2 = new initialise_cons("herry" ,32);
		initialise_cons id3 = new initialise_cons("scarllet" ,30);
		initialise_cons id4 = new initialise_cons("john" ,34);
		
		System.out.println(id1.name +" "+id1.age); // global variable call
		System.out.println(id2.name +" "+id2.age);
		System.out.println(id3.name +" "+id3.age);
		System.out.println(id4.name +" "+id4.age);
		
		

	}

}
