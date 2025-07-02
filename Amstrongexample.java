package projectfor10259;

public class Amstrongexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double sum =0;
		int no = 151;
		
		int temp = no;
		while(temp != 0)
		{
			int d = temp%10;
			sum =  sum + Math.pow(d,3);
			temp= temp/10;
		}

		if(no == sum)
		{
			System.out.println("Armsrongno");
		}else
		{
			System.out.println("not Armsrongno");
		}
	}

}
