package projectfor10259;

import java.util.Scanner;

public class ProductDetails {
	int id;
	String name;
	Scanner sc = new Scanner(System.in);

	/*
	 * public ProductDetails(int id, String name) { super(); this.id = id; this.name
	 * = name; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
