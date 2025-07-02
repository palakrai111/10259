package projectfor10259;

import java.util.Scanner;

public class rowwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		
		System.out.println("enter values");
		for(int i = 0 ; i <3; i++)
		{
			for(int j = 0 ; j <3; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i <3; i++)
		{
			for(int j = 0 ; j <3; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
	}
		
		for(int i = 0 ; i <3; i++)
		{
			int rowsum=0;
			for(int j = 0 ; j <3; j++)
			{
				rowsum = rowsum + a[i][j];
			}
			System.out.println("rowise sum"+rowsum);
	}
		
		
		
		
		

	}

}
