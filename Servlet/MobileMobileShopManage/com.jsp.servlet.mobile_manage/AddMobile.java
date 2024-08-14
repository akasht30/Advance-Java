package com.jsp.servlet.mobile_management_system;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddMobileServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int mobileId=Integer.parseInt(req.getParameter("mobileId"));
		String mobileModel=req.getParameter("mobileModel");
		String mobileBrand=req.getParameter("mobileBrand");
		int mobilePrice=Integer.parseInt(req.getParameter("mobilePrice"));
		
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_mobilemanagementapplication?user=root&password=akash");
			PreparedStatement pst=conn.prepareStatement("INSERT INTO mobile VALUES(?,?,?,?)");
			pst.setInt(1,mobileId);
			pst.setString(2, mobileModel);
			pst.setString(3,mobileBrand);
			pst.setInt(4, mobilePrice);
			
			pst.execute();
			resp.sendRedirect("index.jsp");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
		
	}
}
