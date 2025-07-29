package projectfor10259;

public class main {
	
	public static void main(String[] args)
	{
		//ProductDetails pd[] = new ProductDetails[3];
		CartDetails cd[] = new CartDetails[2];
		for(int i =0 ; i < 2; i++)
		{
			
			  cd[i] = new CartDetails();
			  cd[i].acceptInfo();
		}
		for(CartDetails x : cd)
		{
			System.out.println(x.getName()+" "+x.getQuantity());
			
		}
		
		int id = 103;
		System.out.println("------");
		for(CartDetails x : cd)
		{
			if(x.id == 103)
			{
			System.out.println(x.getName()+" "+x.getQuantity());
			}
			
		}
	}
	
	
	

}
