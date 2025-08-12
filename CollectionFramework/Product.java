package CollectionFramework;

public class Product
{
  int pid;
  String pname;
  public Product(int pid, String pname, int quantity, int price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.quantity = quantity;
	this.price = price;
}
int quantity;
  int price;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
  

}
