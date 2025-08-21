
package in.sp.Daodtodsinpattern;
import java.sql.*;
public class dbcon2 {
	
	
	static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/userinfo";
	static  String DB_USERNAME = "root";
	static String DB_PASSWORD = "localhost";
	
	public static Connection getCon() throws ClassNotFoundException, SQLException
	{
		Class.forName(DB_DRIVER);
	   Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	   
	   if(con!=null)
	   {
		   System.out.println("done");
	   }
	   else
	   {
		   System.out.println("not done");
	   }
		return con;
	}

	
	

	}


