<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% ResultSet rs=(ResultSet)request.getAttribute("resultset"); 
		rs.next();
	%>
	<form action="save-update-mobile" method="post">
		<input type="number" value=<%=rs.getInt(1)%> readonly="readonly" name="mobileId"> <br>
		<input type="text" value=<%= rs.getString(2) %> name="mobileModel"> <br>
		<input type="text" value=<%= rs.getString(3) %> name="mobileBrand"> <br>
		<input type="number" value=<%= rs.getInt(4) %> name="mobilePrice"> <br>
		<input type="submit"  value="UPDATE MOBILES" >
	</form>
	
	
</body>
</html>