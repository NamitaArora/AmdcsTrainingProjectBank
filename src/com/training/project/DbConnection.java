package com.training.project;
import java.sql.*;  
public class DbConnection {

	

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
	  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 		
		 String userName = "system";
		 String password = "oracle";
		 
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(url, userName, password);
				
		if(con!=null)
		{
			System.out.println("Connection Established");
		}
		
		else
		{
			System.out.println("Connection Failed");
		}
		  
		
		con.close();  
		  
		
		}  

	}


