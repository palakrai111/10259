package projectfor10259;

public class dupliateexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,1};
		int key = 5;
		for(int i = 0;i < a.length;i++)
		{
			for(int j = i+1;j< a.length;j++)
			{
				if((a[i]+a[j]==key)&& (i != j))
				{
					System.out.println(a[i]+ " "+a[j]);
				}
			}
			
		}
		
		
		String s = "i am palak";
		String as[] = s.split(" ");
		String x = as[0].toLowerCase();
		String y = as[1].toUpperCase();
		String z = as[2].replace('a','s');
		System.out.println(x+y+z);

	}

}
