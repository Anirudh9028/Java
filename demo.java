
public class demo {

	public static void main(String[] args) 
	{

				String name = "I am Anirudha";
				int length = name.length();
				int exact_length = length-1;
				String rev = "";

				for(int i =exact_length ;i>=0;i--)
				{
					rev= rev + name.charAt(i);
					
				}
				System.out.println(rev);
			}
		

	}

