package in.sp.Daodtodsinpattern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpdaoImpl implements EmpDao 
{

	@Override
	public int addEmp(Employee123 ob)  {
		// TODO Auto-generated method stub
		int i =0;
		try {
			Connection con = dbcon2.getCon();
			
			
			String query = "insert into emp values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(2,ob.getName());
			ps.setInt(1,ob.getEid() );
			i = ps.executeUpdate();
			if(i>0)
			{System.out.println("done");}
			else
			{System.out.println("not done");}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int delEmp(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee123> getALLEmp() {
		// TODO Auto-generated method stub
		List<Employee123>  l = new ArrayList<Employee123>();
		try {
			Connection con = dbcon2.getCon();
			String query = "select * from emp";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int id= rs.getInt(1);
				String name = rs.getString(2);
				Employee123 e = new Employee123(id,name);
				l.add(e);
			}
			
			
			
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}

	@Override
	public Employee123 searchEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
