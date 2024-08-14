package com.jsp.servlet.mobile_management_system;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display-all-mobiles")
public class DisplayAllMobilesServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//JDBC Logic
		Connection conn=null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_mobilemanagementapplication?user=root&password=akash");
			PreparedStatement pst=conn.prepareStatement("SELECT * FROM mobile");

			ResultSet rs=pst.executeQuery();

			req.setAttribute("resultSet1", rs);
			RequestDispatcher  rd=req.getRequestDispatcher("DisplayAllMobiles.jsp");
			rd.forward(req, resp);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
