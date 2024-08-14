package com.jsp.jdbc.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Statement_Delete {
	
	public static void main(String[] args) {
		try {
			
			
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb","root","akash");
		
		Statement st=con.createStatement();
		
		int nowUpdate =st.executeUpdate("DELETE FROM student  WHERE studentId=102");
		
		if(nowUpdate>0) {
			System.out.println(nowUpdate+" data delete sucessfully!!");
		}
		else {
			System.out.println("data is not delete");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
