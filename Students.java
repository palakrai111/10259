package projectfor10259;

public class Students {
	
	String name;
    int rollno;
    static String clgname = "sgsits";
	  void display()
	 {
		 System.out.println(name + " " + rollno + clgname);
	 }

	  void show(int i )
	  {
		  i = 10;
		  System.out.println(i);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //display();
		
		Students ob1 = new Students();
		ob1.name = "abc";
		ob1.rollno = 12;
		ob1.display();
		Students ob2 = new Students();
		ob2.name = "xyz";
		ob2.rollno = 13;
		ob2.display();
		
	}

}
