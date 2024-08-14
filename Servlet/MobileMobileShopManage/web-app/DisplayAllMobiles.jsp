<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>
	<h1>Mobiles</h1>
	<% 
		ResultSet rs=(ResultSet)request.getAttribute("resultSet1");
		rs.next();
	%>
	 <table border="">

		<tr>
			<th>Mobile Id</th>
			<th>Mobile Model</th>
			<th>Mobile Brand</th>
			<th>Mobile Price</th>
			<th>Update
			</th>
			<th>Delete 
			</th>
		</tr>	 
	 
	 
	 <%
	 	while(rs.next()){
	 %>
	 
	 <tr>
	 	<td><%=rs.getInt(1) %></td>
	 	<td><%= rs.getString(2) %></td>
	 	<td><%=rs.getString(3) %></td>
	 	<td><%= rs.getInt(4) %></td>
	 	<td><a href="update-mobile?mobileId=<%=rs.getInt(1)%>">UPDATE</a></td>
	 	<td><a href="delete-mobile?mobileId=<%=rs.getInt(1)%>">Delete</a></td>
	 </tr>
	 <%} %>
	 </table>
	
</body>
</html>