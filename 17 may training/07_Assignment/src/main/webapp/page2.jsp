<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>

<%
	String name = request.getParameter("txtname1");
	session.setAttribute("username", name);
	%>

<h3> Page 2</h3>
<form action="display.jsp" method ="post">
Name<input type="text" name="txtname2"> <br>

<br>
<input type="submit" value="OK">
</form>

</body>
</html>