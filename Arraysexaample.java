package projectfor10259;

import java.util.Scanner;

public class Arraysexaample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int a[] = {1,2,3,4};  //{0,1,2,3}
		int sum = 0;
		for(int i = 0; i < a.length;i++) // a.length = 4
		{
			System.out.println(a[i]);
			sum = sum+ a[i];
		}
System.out.println(sum);

       int b[] = new int[5];
       b[0] = 1;
       b[1] = 1;
       b[2] = 1;
       b[3] = 1;
       b[4] = 1;
       //b[5] = 1;
       System.out.println("enter elemnts");
       for(int j = 0; j < b.length;j++)
       {
    	   b[j] = sc.nextInt();
       }
       for(int j = 0; j < b.length;j++)
       {
    	   System.out.println(b[j]);
       }
   
	}

}
