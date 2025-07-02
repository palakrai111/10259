package projectfor10259;
import java.util.*;
public class dowhileswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);	
		char choice = 'y';
		do
		{
			System.out.println("enter your name");
			
			String name = sc.next();
            System.out.println("enter your password");
			
			String pwd = sc.next();
			System.out.println("enter you choice from no 1 to 5");
			int i = sc.nextInt();
			switch(i)
			{
			case 1: System.out.println("first case");
			break;
			case 2: System.out.println("second case");
			break;
			default: System.out.println("incorrect");
			}
         System.out.println("if you want to continue press y else n");
			
			choice = sc.next().charAt(0);
			
			
		}
		while(choice == 'y');
		

	}

}
