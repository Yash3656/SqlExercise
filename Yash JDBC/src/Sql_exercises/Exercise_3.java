/*Write a JAVA program to update the records in BANK table using Statement.executeUpdate().*/

package Sql_exercises;

import java.sql.*;

public class Exercise_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost/exercise";
		String user = "root";
		String password ="Yash@123";
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		Statement st = conn.createStatement();
		String sql = "update bank set AccountBal = '5000' where AccountNo = 2";
		st.executeUpdate(sql);
	}

}
