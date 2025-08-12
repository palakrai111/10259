package CollectionFramework;

import java.util.ArrayList;

public class Inventory {
	
	ArrayList<Product> products;
	
	Inventory()
	{
		 products = new ArrayList<Product>();
	}

	void addProduct(Product p)
	{
		products.add(p);
		
	}
	
	void displayAll()
	{
		for(Product p : products)
		{
			System.out.println(p.pname + " " + p.quantity);
		}
	}
	
	void checklowInventory()
	{
		System.out.println("low inventory products");
		for(Product p : products)
		{
			if(p.quantity < 100)
			{
				
				System.out.println(p.pname + " "+ p.quantity);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Inventory ob = new Inventory();
		ob.addProduct(new Product(1,"shirt",50,500));
		ob.addProduct(new Product(2,"pant",150,1500));
		ob.addProduct(new Product(1,"top",80,1500));
		ob.displayAll();
		ob.checklowInventory();

	}

}
