package Compony_Assingment;



class asd {
	





	public static void main(String arg[])
	{
	
		int jk[]= {47,89,56,25,45,65};
		int max = jk[0];
		int min =jk[0];
		for(int i=0;i<jk.length;i++) {
			
				
				
				if(max<jk[i]) {
					max = jk[i];}
				
				if(min>jk[i]) 
				{
					min =jk[i];}
				
			
		}
		System.out.println(max+" "+min);
	}
}
