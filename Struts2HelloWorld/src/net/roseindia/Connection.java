package net.roseindia;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.Result;

public class Connection {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Aricad2");
			
			Statement statement =((java.sql.Connection) con).createStatement();
			String sql="Select * from Utilisateur";
			
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()) 
				
				
				System.out.println(rs.getInt("ID")+"");
				
				((ResultSet) con).close();
			
			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
