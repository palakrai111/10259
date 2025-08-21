package in.sp.sqlprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Connection con = dbcon2.getCon();
		String query = "delete from user1 where name = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,"palak");
		//ps.setString(2,"palakabc");
		//ps.setString(3,"palak@");
		
		int i =ps.executeUpdate();
		if(i>0)
		{System.out.println("deletion done");}
		else
		{
			System.out.println("deletion not done");
		}
		
		
		String query1 = "select * from user1";
		
		PreparedStatement ps1 = con.prepareStatement(query1);
		ResultSet rs = ps1.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getString(1));
			
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.println();
		}
		
		
		

	}

}
