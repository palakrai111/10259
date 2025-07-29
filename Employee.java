package projectfor10259;
import java.util.*;
public class Employee {
	
	String name;
	int eid;
	
	void acceptInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter eid");
		eid = sc.nextInt();
		
	}
    void displayInfo()
    {
    	System.out.println(eid + " " +name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee ob1 = new  Employee();
		 Employee ob2 = new  Employee();
		 ob1.acceptInfo();
		 ob2.acceptInfo();
		 ob1.displayInfo();
		 System.out.println("=========");
		 ob2.displayInfo();

	}

}
