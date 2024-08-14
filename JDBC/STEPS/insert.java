//Insert a elements in database.

package com.jsp.jdbc.studentdb;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class insert { 
	public static void main(String[] args) {


		try {
			//1.Load &  register the driver
			Driver driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			//2.Establish the connection
			Connection conn=DriverManager.getConnection("jdbc:Mysql://localhost:3306","root","akash");

			//3.create a statement
			Statement st=conn.createStatement();

			//4.Execute the query
			int rowInserted=st.executeUpdate("INSERT INTO jdbc_studentdb.student VALUES(130,'John','john123@gmail.com',80)");
			
			//5.Process the result
			if(rowInserted>0) {
				System.out.println(rowInserted+" data inserted successfully!! ");
			}
			else {
				System.out.println("Data not inserted");
			}
			//6.Close statement
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
