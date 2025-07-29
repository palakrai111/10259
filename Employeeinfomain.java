package projectfor10259;

class EmpInfo
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void empdetails()
	{
		System.out.println("emp details :  "+name);
	}
}
class TempEmp extends EmpInfo
{
	int salary = 10000;
	void bonus(int bamt)
	{
		salary = salary  + bamt;
		System.out.println("updated salar with bonus is"+salary);
	}

}
class PerEmp extends EmpInfo
{
	int salary = 50000;
	void bonus(int bamt)
	{
		salary = salary  + bamt;
		System.out.println("updated salar with bonus is"+salary);
	}


}

public class Employeeinfomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TempEmp te = new TempEmp();
		te.setName("abc");
		te.empdetails();
		te.bonus(500); //updated salary for tem emp
		System.out.println("=====");
		PerEmp pe = new PerEmp();
		
		pe.setName("xyz");
		pe.empdetails();
		pe.bonus(10000);

	}

}


///Inheritance always represents Is-A ( dog is a animal,oppo is a mobile,
//Aggregation represents has-A relationship (car has-A MusicPlayer)
