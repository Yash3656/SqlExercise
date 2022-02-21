/* Write a JAVA program to update the Bank table with column ("AccountNo","AccountBal") using resultset object.*/
 
 package Sql_exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost/exercise";
		String user = "root";
		String password ="Yash@123";
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		String s ="select * from bank where AccountNo = 20";
		Statement st = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery(s);
		while(rs.next())
		{
			System.out.println("Enter the Account Balance u want to Update:--");
			int bal = sc.nextInt();
			rs.updateInt("AccountBal", bal);
			rs.updateRow();
		}
		System.out.println("Updated Bank table");
	}

}
