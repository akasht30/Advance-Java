package com.jsp.jdbc.studentdb;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class JDBC_Statemement_Select {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb", "root", "akash");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM student");
			System.out.println("studentId/studentName/studentMail/studentMarks");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString("studentMail"));
				System.out.println(rs.getInt("studentMarks"));
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
