package in.sp.Daodtodsinpattern;

import java.util.List;

public interface EmpDao 
{
     public int addEmp(Employee123 ob);
     public int delEmp(int id);
     public List<Employee123> getALLEmp();
     public Employee123 searchEmp(int id);
     
}
