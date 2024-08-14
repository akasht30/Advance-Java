package com.jsp.jdbc.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Statement_Update {
	public static void main(String[] args) {
		try {
			
			
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb","root","akash");
		
		Statement st=con.createStatement();
		
		int nowUpdate =st.executeUpdate("UPDATE student SET studentMail='anai224@gmail.com',studentMarks=100 WHERE studentId=102");
		
		if(nowUpdate>0) {
			System.out.println(nowUpdate+" data updated sucessfully!!");
		}
		else {
			System.out.println("data is not updated");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
