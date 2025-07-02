package projectfor10259;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int n = 152;
		int no = 152;
		while(no != 0)
		{
			int d = no%10;
			sum = sum + Math.pow(d,3);
			no = no/10;
		}
		if(n == sum)
		{
			System.out.println("done");
		}else
		{
			System.out.println("not done");
		}
		
		int a[] = new int[5];
		a[0]=1;
		a[1]=1;
		a[2]=1;
		a[3]=1;
		a[4]=1;
		int sum1 = 0;
		for(int i = 0; i <a.length;i++)
		{
		  sum1 = sum1 + a[i];
		  
		}
		System.out.println(sum1);
		
		
		/*for(int i = 5; i >=1; i--)
		{
			
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*" + " ");
				
			}

			System.out.println();
		}*/

		for(int k = 1; k<=5; k++)
		{
			if(k == 3)
			{
			  continue;	
			}
			System.out.println(k);
		}
	}

}
//pattern // do while (switch) // armstrong no //break,continue,array
//search