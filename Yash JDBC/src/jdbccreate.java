import java.util.*;
import java.sql.*;

public class jdbccreate {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost/practiceDB";
		String username = "root";
		String password = "Yash@123";
		
		Connection con=DriverManager.getConnection(dbUrl,username,password);
		Statement s=con.createStatement();
		String sql="create table accountant(id integer,name varchar(20),salary varchar(30))";
		s.executeUpdate(sql);
		System.out.println("Table Created successfully !!!");
	}

}
