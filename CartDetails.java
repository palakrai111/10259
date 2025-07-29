package projectfor10259;

public class CartDetails extends ProductDetails {
	int cid;
	int pid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	int quantity;
	
	
	void acceptInfo()
	{
		System.out.println("id");
		 id = sc.nextInt();
		 System.out.println("name");
		name = sc.next();
		 System.out.println("quantity");
		quantity = sc.nextInt();
	}
	
	void displaynifo()
	{System.out.println(id + " "+name+ " "+quantity);}

}
