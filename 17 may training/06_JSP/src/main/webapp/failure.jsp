<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure Page</title>
</head>
<body>
<%String user = request.getParameter("txtname1") ; %>
<h3>Oops..Try Again
 	<%=user %></h3>
</body>
</html>