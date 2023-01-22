package constructer;

public class Parametric_constructer {
	
	public Parametric_constructer (int i) {
		
		System.out.println("Parametric_constructer1 say hhii and its value is \n" + i );
	}
	
    public Parametric_constructer (int i,int j) {
		
		System.out.println("Parametric_constructer2 say hii and its value is \n" + i+" and "+ j );
	}

	public static void main(String[] args) {
		Parametric_constructer obj1 = new Parametric_constructer(10);
		Parametric_constructer obj2 = new Parametric_constructer(10,20);
		
		

	}

}
