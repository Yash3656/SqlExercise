// Excercise 4: Write a program to delete the accountant whose id="405" from accountant table

import java.sql.*;
public class jdbcdelete
{

	public static void main(String[] args)throws SQLException
	{
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost/practiceDB";
		String username = "root";
		String password = "Yash@123";
		
		Connection con=DriverManager.getConnection(dbUrl,username,password);
		Statement s=con.createStatement();
		String sql="delete from accountant where id='405'";
		s.executeUpdate(sql);
		System.out.println("Record deleted successfully !!!");

	}

}
