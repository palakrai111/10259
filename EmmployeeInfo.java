package projectfor10259;
import java.util.Scanner;
public class EmmployeeInfo {

	int id;
	String name;
	
	
	/*
	 * public EmmployeeInfo(int id, String name) {
	 * 
	 * this.id = id; this.name = name; }
	 */

      Scanner sc = new Scanner(System.in);
	  void acceptinfo()
	  {System.out.println("id");
		id = sc.nextInt();
		System.out.println("name");
		name = sc.next();
	  }
	  void display()
	  {
		  System.out.println(id + " "+name);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmmployeeInfo ed[] = new EmmployeeInfo[2]; //{o,1}
		//EmmployeeInfo ob;
		for(int i = 0; i < 2;i++)
		{
			ed[i] = new EmmployeeInfo(); //{}
			ed[i].acceptinfo();
		
		}
		for(int i = 0; i < 2;i++)
		{
			ed[i].display();
		}
		
		int id1 = 101;
		System.out.println("search emp");
         for(EmmployeeInfo ob : ed)
         {
        	 if(ob.id == id1)
        	 {
        		 System.out.println("employee is present");
        	 }
        	 else
        	 {
        		 System.out.println("not present");
        	 }
         }
	}

}
