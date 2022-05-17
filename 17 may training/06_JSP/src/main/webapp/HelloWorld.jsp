<%@page import="java.time.LocalDate" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body><%!String message="java is best programming language :" ; %>
<%!double num1=100.55; %>
<%!double num2=104.67; %>
<%! LocalDate localdate = LocalDate.now(); %>
<%
for (int i=0;i<10;i++)
{
%>
<h3>JSP is Simple</h3>
<%
out.println(message);
out.print(localdate);
%>
<br>
<%= (num1 + num2) %>
<% 
}
%>
</body>
</html>