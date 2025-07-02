package projectfor10259;
import java.util.*;
public class demo {
	int instace;
	void m1()
	{
		//localvariable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 10;
		int y = 20;
		int z = (y>x)?y:x;
		char ch1='y';
		System.out.println(z);
		do 
		{
			int k = sc.nextInt();
			System.out.println(k);
			int ch=1;
			switch(ch)
			{
			case 1: System.out.println(k);
			break;
			default : System.out.println("d");
			}
			System.out.println("do you want to c");
			ch1= sc.next().charAt(0);
		}
		while(ch1 == 'y');
		
		
	}

}
