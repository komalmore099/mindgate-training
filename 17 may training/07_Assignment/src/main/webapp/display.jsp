<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	String name =session.getAttribute("username").toString();
	String address=request.getParameter("txtname2");
	%>

<h3>Hii 
 	<%=name %></h3>
 	<br>
 <h3>Location 
 	<%=address %></h3>

 	
</body>
</html>