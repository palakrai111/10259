package projectfor10259;

public class emp {

	int id;
	String name;
	
	public emp(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return id + " "+name ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp ob = new emp(1,"abc");
		System.out.println(ob);

	}
	

}
