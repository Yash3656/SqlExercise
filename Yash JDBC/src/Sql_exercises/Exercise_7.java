 /*Write a Java program  to insert a record with values taken from user into the table countries against
  *  each columns using prepared statement. We can use a string array to store our own values.*/
 
 package Sql_exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class Exercise_7 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost/exercise";
		String user = "root";
		String password ="Yash@123";
		Scanner sc =new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		PreparedStatement pt = conn.prepareStatement("insert into countries values(?,?,?,?)");
		System.out.println("Enter the Number of Entries u want to insert");
		int i =sc.nextInt();
		int n = 0;
		do
		{
			System.out.println("Enter the Country-Id");
			int c_id =sc.nextInt();
			pt.setInt(1,c_id);
			System.out.println("Enter the Country-Name");
			String c_name =sc.next();
			pt.setString(2,c_name);
			System.out.println("Enter the Region-Id");
			int r_id =sc.nextInt();
			pt.setInt(3,r_id);
			System.out.println("Enter the Region-Name");
			String r_name =sc.next();
			pt.setString(4,r_name);
			pt.executeUpdate();
			n++;
		}while(n<i);

	}

}
