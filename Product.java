package projectfor10259;

public class Product {
	
	int pid;
	String pname;
	int price;
	void setPrice(int p)
	{
		if(p<1000)
		{
			System.out.println("not allowed");
		}
		else
		{
			price = p;
		}
	}
	void setPid(int pid)
	{
		this.pid = pid;
	}
	void setPname(String pname)
	{
		this.pname = pname;
	}
	int getPid()
	{
		return pid;
	}
    String getPname()
    {
    	return pname;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Product ob = new  Product();
		 ob.setPid(101);
	     ob.setPname("palak");	
	     System.out.println(ob.getPid());
	     System.out.println(ob.getPname());
	    

	}

}
