package projectfor10259;

public class CartInfo extends ProductInfo
{
    int cid;
    int pid;
    int quantity;
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
    void display()
    {
    	System.out.println(id + " "+name+ " "+quantity);
    }
}
