package in.sp.Daodtodsinpattern;

import java.util.ArrayList;
import java.util.List;

public class Empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee123 ob = new Employee123(2,"nayan");
		EmpdaoImpl impl =new EmpdaoImpl();
		int i = impl.addEmp(ob);
		if(i>0)
		{System.out.println("done");}
		else
		{System.out.println("not done");}
		
		System.out.println("======");
		
		
		List<Employee123>  l = impl.getALLEmp();
		
		for(Employee123 ex : l)
		{
			System.out.println(ex.getEid() + " "+ex.getName());
		}
	}

}
