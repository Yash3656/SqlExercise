//Excercise 3: Write a program to get the list of accountant from accountant table

import java.util.*;
import java.sql.*;

public class Jdbcdisplay
{
	public static void main(String args[])throws SQLException
	{
		String dbUrl = "jdbc:mysql://localhost/practiceDB";
		String username = "root";
		String password = "Yash@123";
		
		Connection con=DriverManager.getConnection(dbUrl,username,password);
		Statement s=con.createStatement();
		String sql="Select * from accountant";
		ResultSet rs=s.executeQuery(sql);
		
		if(rs.next())
		{
			System.out.println("Accountant Details are - \n");
			do
			{
			  System.out.println("Id of accountant is "+rs.getInt(1)+ "\nName of accountant is "+rs.getString(2)+    "\nSalary of accountant is "+rs.getString(3)+"\n");
			}while(rs.next());
		}
		else
		{
			System.out.println("No records found !!");
		}
		
	}
}