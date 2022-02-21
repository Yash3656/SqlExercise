/*Write a JAVA program to insert 5 records in BANK table with column ("AccountNo","AccountBal")  using prepared statement.*/

package Sql_exercises;
import java.sql.*;
import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost/exercise";
		String user = "root";
		String password ="Yash@123";
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		PreparedStatement pt = conn.prepareStatement("insert into bank values(?,?)");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int n=0;
		while(n<4)
		{
			System.out.println("Enter the AccountNo:-- ");
			int p = sc.nextInt();
			pt.setInt(1,p);
			System.out.println("Enter the AccountBalance:-- ");
			int q = sc.nextInt();  
			pt.setInt(2,q);
			pt.executeUpdate();
			n++;
		}
		System.out.println("Records Inserted");
		conn.close();

	}

}
