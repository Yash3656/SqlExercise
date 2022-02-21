/*Write a Java program to  alter table countries including columns country_id,country_name and region_id  to add a column region_name .*/

package Sql_exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exercise_6 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost/exercise";
		String user = "root";
		String password ="Yash@123";
		String sq = "alter table countries add region_name varchar(50) not null";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		Statement st = conn.createStatement();
		st.executeUpdate(sq);
		System.out.println("Added New Column ");

	}

}
