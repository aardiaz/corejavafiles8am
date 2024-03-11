package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//getConnection(url,un,psw)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb8am", "root", "1234");
		
		//--------------------- insert sql ----------------------------------
		
//		//a. write sql
//		   String sql = "insert into user(username,password)values('YYYY','W4444') ";
//		//b. create statement
//		   Statement  stm = con.createStatement();
//		//c. execute sql
//		   stm.execute(sql);
//		//d. close db
//		   con.close();
//		   
//		   System.out.println("success");
		
		
 //----------------------- delete sql -----------------------------
        		
//		String sql = "delete  from user where id = 6 ";
//		Statement stm  = con.createStatement();   
//		stm.execute(sql);
//		  
//		  con.close();
//		  System.out.println("success");
		
		
		
	//---------------------- update sql -----------------------------------
//		String sql = "update user set  password = 'www222' where id = 8 ";
//		Statement  stm = con.createStatement();
//		stm.execute(sql);
//		
//		con.close();
//		System.out.println("success");
		
		
//---------------------------- select sql --------------------------------
		String sql = "select * from user ";
		Statement stm  = con.createStatement();
		ResultSet  rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("Id = "+rs.getInt("id"));
			System.out.println("UserName = "+rs.getString("username"));
			System.out.println("Password = "+rs.getString("password"));
			System.out.println("--------------");
		}
		
		
	}
	
}
