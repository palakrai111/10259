package Exceptiondemoexampes;

public class exampletrycatchfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			int i = 10;
			int j =1;
			int k = i/j;
		}
        finally
		{
			System.out.println("i am always executed");
		}
	}

}
