package projectfor10259;

public class Exceptionexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("welcome");
		int i = 10;
		int j = 0;
		String s = null;
		try
		{
		//int z = i/j; //exception occured
		
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		//System.out.println(z);
		System.out.println("ends");
		

	}

}
