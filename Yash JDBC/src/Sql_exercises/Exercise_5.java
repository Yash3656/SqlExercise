/*Write a Java program to create  a table  countries including columns country_id,country_name and region_id .*/

package Sql_exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exercise_5 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost/exercise";
		String user = "root";
		String password ="Yash@123";
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,password);
		Statement st = conn.createStatement();
		st.executeUpdate("create table countries(country_id int(10),country_name varchar(30),region_id varchar(30))");
		System.out.println("Table Created");

	}

}
