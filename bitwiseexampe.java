package projectfor10259;
import java.util.*;
public class bitwiseexampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 8; //1000
		int b = 9 ; // 1001
		int z = a&b; // 1000 |1001 ->  1001 -> 9 -> 
		//1*2(0) + 0*2(1) + 0*2(2) + 1 2(3)
		System.out.println(z);
		
		int x = 10;
		int y = 7;
		/*String result = (y > x)? "x is greater" : "y is lesser";
		System.out.println(result);
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("enter weight");
		int weight = sc.nextInt();
		System.out.println("entr gender");
		char gender = sc.next().charAt(0);
		
		if(age > 18 && weight < 70 && gender == 'M')
		{
			System.out.println("peson is elgible for physical test");
		}else
		{
			
			System.out.println("peson is not elgible for physical test");
		}*/
		
		int no =  0;
		
		if(no> 0)
		{System.out.println("positive");}
		else if(no < 0) 
		{System.out.println("negative");}
		else
		{
			System.out.println("zero");	
		}
		
		
		int choice = 1;
		switch(choice)
		{
		case 1: System.out.println("i am first case");
		//break;
		case 2: System.out.println("i am second case");
		//break;
		default: System.out.println("i am default case");
		
		}
		int sum = 0;
		for(int i = 1; i <=5;i++)
		{
			System.out.println(i*10);
			sum= sum + i;
		}
		System.out.println(sum);
		System.out.println("while loop");
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		int num = 12231;
		int temp = num;
		int rev= 0;
		int sum1= 0;
		int length = 0;
		
		while(temp != 0)
		{
			int d = temp %10; // 1234%10 -> 4 ,3,2,1,
			rev = rev * 10 + d;  // 4,43,432,421
			sum1 = sum1 + d;
			 temp = temp/10; //123,12,1,0
			 length++;
			
		}
		
		System.out.println(rev);
		System.out.println(sum1);
		System.out.println("lngth:"+length);
		if(rev == num)
		{
			System.out.println("palndrome");
			
		}
		else
		{
			System.out.println("not palndrome");
		}
	}

}
