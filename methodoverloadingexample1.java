package projectfor10259;

public class methodoverloadingexample1 {
	
	static int add(int a, int b)
	{
		int z = a+b;
		System.out.println(z);
		return z;
	}
	static void add(String a, int b)
	{
		String z = a+b;
		System.out.println(z);
	}
	
	public static void main(String x) 
	{
		System.out.println("hello" + x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2);
		add("palak",1);
		main("palak");

	}

}
