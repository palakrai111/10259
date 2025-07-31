package Exceptiondemoexampes;

public class ThrowExample {
	
	 static void checkAge(int age) throws AgeNotValid
	 {
		if(age < 18) 
		{
			throw new AgeNotValid("Age is  not valid to vote");
		}
		else
		{
			System.out.println("valid age");
		}
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		checkAge(16);
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
