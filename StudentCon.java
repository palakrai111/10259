package projectfor10259;

public class StudentCon {
	String name;
	int eid;
	int fees;
   StudentCon(String name,int eid)
	{
		this.name = name;
		this.eid = eid;
		//show();
	}
	StudentCon(String name,int eid,int fees)
	{
		this(name,eid);
		this.fees = fees;
	}
	void display()
	{
		System.out.println(name + " " +eid + " " +fees);
		//System.out.println(n+ " " + e);
	}
  void show()
  {
	  System.out.println("hello");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentCon ob3 = new StudentCon("palak",101,2000);
		//StudentCon ob2 = new StudentCon("nayan",102,1000);
		//StudentCon ob = new StudentCon("palak");
		ob3.display();
		//ob2.display();

	}

}
