import java.io.*;
import java.sql.*;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/abc","root","Yash@123");
		/*String sql = "insert into emp values(?,?)";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setInt(1,10);
		pt.setString(2,"Yash");
		int i=pt.executeUpdate(); 
	    System.out.println(i+" records inserted"); 
	    PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?"); 
	    stmt.setString(1,"Sono");
	    stmt.setInt(2,10); //1 specifies the first parameter in the query i.e. name 
	    
	     
	    int n=stmt.executeUpdate(); 
	    System.out.println(n+" records updated"); 
	    PreparedStatement pt1 = con.prepareStatement("select * from emp");
		ResultSet rs =pt1.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +" " + rs.getString(2));
		}
		*/
		PreparedStatement pt = con.prepareStatement("insert into emp values(?,?)");
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		     
		    do{ 
		    System.out.println("enter id:"); 
		    int id=Integer.parseInt(br.readLine()); 
		    System.out.println("enter name:"); 
		    String name=br.readLine(); 
		   /* System.out.println("enter salary:"); 
		    float salary=Float.parseFloat(br.readLine()); */
		     
		    pt.setInt(1,id); 
		    pt.setString(2,name); 
		   // pt.setFloat(3,salary); 
		    int i=pt.executeUpdate(); 
		    System.out.println(i+" records affected"); 
		     
		    System.out.println("Do you want to continue: y/n"); 
		    String s=br.readLine(); 
		    if(s.startsWith("n")){ 
		    break; 
		    } 
		    }while(true); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
