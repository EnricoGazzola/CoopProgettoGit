package it.sincrono.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UtilityDatabase{

			
//	{	
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/coop?user=root&password=root");
//			Statement t=c.createStatement();
//			ResultSet r=t.executeQuery("select * from "+tabella+"");
//
//			while(r.next()) {
//				ac=new Amministratori();
//				ac.setUsername(r.getString("first_name"));
//				ac.setPassword(r.getString("last_name"));
//				l.add(ac);
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return l;
//		
//	}

	public boolean loginTabella(String username, String password) {

		boolean login = false;
		try{
	        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coop?user=root&password=root");    
	        PreparedStatement pst = conn.prepareStatement("Select username,password from amministratori where username=? and password=?");
	        pst.setString(1, username);
	        pst.setString(2, password);
	        ResultSet rs = pst.executeQuery();                        
	        if(rs.next()) {
	            System.out.println("Valid login credentials");  
		        login=true;
	        }
	      
	        else {
	        	System.out.println("Invalid login credentials");            
	        }
	   }
	   catch(Exception e){       
		   System.out.println("Something went wrong !! Please try again");       
	   }      
		return login;
	}
	
}