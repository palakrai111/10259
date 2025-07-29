package projectfor10259;


class Emp1
{
   int eid;
   String name;
   Emp1(int eid,String name)
   {
	   this.eid =eid;
	   this.name = name;
	   
   }
   
   
}
class PerEmp1 extends  Emp1
{
	int bonus ;
	PerEmp1(int eid,String name,int bonus)
	{ 
		super(eid,name);
		this.bonus = bonus;
	}

	void display()
	   {
		   System.out.println(eid + " "+name+ ""+bonus);
	   }
}
public class Empmain123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 PerEmp1 ob = new  PerEmp1(1,"palak",123);
		 ob.display();

	}

}
