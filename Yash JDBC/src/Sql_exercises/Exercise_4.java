/* Write a JAVA program to get  connection object using hostname , user,password stored in external properties file.*/

package Sql_exercises;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class Exercise_4 {

	public static void main(String[] args) throws Exception{
	
		FileReader reader = new FileReader("D:\\Development\\Workspace\\javatutorial\\Yash JDBC\\src\\Sql_exercises\\dpp.properties");
		// TODO Auto-generated method stub
		Properties pr = new Properties();
		pr.load(reader);
		String url =pr.getProperty("hostname");
		String user = pr.getProperty("user");
		String password = pr.getProperty("password");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection(url,user,password);
		System.out.println("Connecion done successfully");

	}

}
