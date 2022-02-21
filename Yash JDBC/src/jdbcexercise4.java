//Excercise 2:Write a program to insert 2 accountant in accountant details

import java.sql.*;
import java.util.Scanner;

public class jdbcexercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost/practiceDB";
		String username = "root";
		String password = "Yash@123";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try 
		{
			Connection conn = DriverManager.getConnection(dbUrl,username,password);
			Statement s = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter how many records you want to insert : ");
			int n =sc.nextInt();
			for(int i= 0; i<n;i++)
			{
				System.out.println("Enter id");
				int a=sc.nextInt();
				System.out.println("Enter name");
				String b=sc.next();
				System.out.println("Enter Salary");
				String c = sc.next();
				s.executeUpdate("insert into accountant values('"+a+"','"+b+"','"+c+"')");
			}
			System.out.println("Record inserted!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
